/*
Name:Ege Ozan Özyedek
Date:11.10.2017
Program Description:A program that makes it easier for a company to crate websites for their employees simply by entering spesific info about them
Program Name:lab02e
*/
import java.util.Scanner;

public class lab02e {

  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
     //Constants
     final String PARA = "<p>";
     final String PARA_CLOSE = "</p>";
     final String BODY = "<body>";
     final String BODY_CLOSE = "</body>";
     final String HTML = "<html>";
     final String HTML_CLOSE = "</html>";
     final String TITLE = "<title>" ;
     final String TITLE_CLOSE = "</title>";
     final String HEAD = "<head>";
     final String HEAD_CLOSE = "</head>";
     final String H1= "<h1>";
     final String H1_CLOSE= "</h1>";
     final String HR = "<hr>";
     final String DOCTYPE = "<!DOCTYPE html>";
     //Variables
     String name; 
     int age ;
     double salary;
     String comment ;
     
     // Info that will be asked to the user
     name = input.next();
     age = input.nextInt();
     salary = input.nextDouble();
     comment = input.next();
         
     //The html code that will be printed with the info given
     System.out.println("");
     System.out.println(DOCTYPE);
     System.out.println("");
     System.out.println(HTML); 
     System.out.println("");
     System.out.println(HEAD);
     System.out.println(TITLE + name + "'s Home Page" + TITLE_CLOSE);
     System.out.println(HEAD_CLOSE);
     System.out.println("");
     System.out.println(BODY);
     System.out.println("");
     System.out.println(HR);
     System.out.println(H1 + name + H1_CLOSE);
     System.out.println(PARA + "Age:" + age + PARA_CLOSE);
     System.out.println(PARA + "Salary:" + salary + PARA_CLOSE);
     System.out.println(PARA + "Comments:" + comment + PARA_CLOSE);
     System.out.println(HR);
     System.out.println("");
     System.out.println(BODY_CLOSE);
     System.out.println("");
     System.out.println(HTML_CLOSE);
    
     input.close();
  }
}