/*
 Name:Ege Ozan Özyedek
 Date:18.10.2017
 Program Description:A program that makes it easier for a company to crate websites for their employees simply by entering spesific info about them
 Program Name:lab03c
 */
import java.util.Scanner;
import java.nio.file.*;   
import java.io.*;


public class lab03c {
  
  public static void main(String[] args) throws FileNotFoundException{
    Scanner input = new Scanner(System.in);
    PrintStream originalStdOut = System.out;
    
    //Constants
    final String PARA = "<p>" ;
    final String PARA_CLOSE = "</p>" ;
    final String BODY = "<body>" ;
    final String BODY_CLOSE = "</body>" ;
    final String HTML = "<html>" ;
    final String HTML_CLOSE = "</html>" ;
    final String TITLE = "<title>" ;
    final String TITLE_CLOSE = "</title>" ;
    final String HEAD = "<head>" ;
    final String HEAD_CLOSE = "</head>" ;
    final String H1= "<h1>" ;
    final String H1_CLOSE= "</h1>" ;
    final String HR = "<hr>" ;
    final String DOCTYPE = "<!DOCTYPE html>" ;
    final String IMG_OPEN = "<img src=\"" ;
    final String IMG_CLOSE = "\" >" ;
    final int SALARY_LOW = 1000 ;
    final int SALARY_HIGH = 5000 ;
    
    //Variables
    String name ; 
    int age ;
    double grossSalary ;
    String comment ;
    double netSalary ;
    String imageFile ;
    
    
    
    // Info that will be asked to the user
    System.out.println ("Enter the name of the employee");
    name = input.next();
    
    
    System.out.println ("Enter the age of the employee");
    age = input.nextInt();
    
    //This will stop the program if an invalid age value is entered
    if (age<=0) {
      System.out.println ("Invalid value, please enter a positive value for age. ");
    }
    
    //If age value is correct it will continue the program
    else {  
      
      //It will ask the user for the remaining values
      System.out.println ("Enter the gross salary of the employee");
      grossSalary = input.nextDouble();
      
      //This will stop the program in case the gross salary entered is lower than 0 or the salary entered is higher than 10000
      if (grossSalary<=0 || 10000<grossSalary) {
        System.out.println ("Invalid value, please enter a positive value for salary. Salary should also be lower than 10000 ");
      }
      
      //This will continue the program if the salary value is correct and will ask the remaining input which is comment
      else {
        System.out.println ("Enter a comment about the employee");
        comment = input.next();
        
        //After all the values are given we declare variables
        netSalary = ' ' ;
        imageFile = name + ".jpg" ;
        
        //The three if/else if statements below determine what the net salary will be depending on the gross salary
        if (grossSalary < SALARY_LOW)  { 
          netSalary = (grossSalary - 100 - (grossSalary - 100)* 0.05);
        }
        
        else if ( SALARY_LOW <= grossSalary && grossSalary <= SALARY_HIGH )  { 
          netSalary = (grossSalary - 100 - (grossSalary - 100)* 0.15);
        }
        
        else if (SALARY_HIGH < grossSalary)  { 
          netSalary = (grossSalary - 100 - (grossSalary - 100)* 0.25);
        }
        
        //Program will start printing the html code
        System.setOut( new PrintStream( "magic.htm" ) );
        
        System.out.println ("");
        System.out.println (DOCTYPE);
        System.out.println ("");
        System.out.println (HTML); 
        System.out.println ("");
        System.out.println (HEAD);
        System.out.println (TITLE + name + "'s Home Page" + TITLE_CLOSE);
        System.out.println (HEAD_CLOSE);
        System.out.println ("");
        System.out.println (BODY);
        System.out.println ("");
        System.out.println (HR);
        
        //The if statement below determine if an html code for the image will be printed or not depending on the files existence
        if (Files.exists( Paths.get( imageFile ) )) {
          System.out.println ( IMG_OPEN + imageFile + IMG_CLOSE);
        }
        System.out.println (H1 + name + H1_CLOSE);
        System.out.println (PARA + "Age:" + age + PARA_CLOSE);
        System.out.println (PARA + "Salary:" + netSalary + PARA_CLOSE);
        System.out.println (PARA + "Comments:" + comment + PARA_CLOSE);
        System.out.println (HR);
        System.out.println ("");
        System.out.println (BODY_CLOSE);
        System.out.println ("");
        System.out.println (HTML_CLOSE);
        
        System.out.close();
        System.setOut( originalStdOut);
        System.out.println ( "Webpage created.");
        
      }
    }
    input.close();
  }
}