/*
Name:Ege Ozan Özyedek
Date:11.10.2017
Program Description:Calculates simple problems with values given by user
Program Name:lab02c
*/
import java.util.Scanner;

  public class lab02c
{
  public static void main(String[] args)
  {
    //Variables
    int value1 ;
    int value2 ;
    double remainder ;
    
    
    
    //User will input two values
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter two values");
    value1 = input.nextInt();
    value2 = input.nextInt();
    remainder = value1 % value2 ;
     
     
    //Some calculations that will be made with the user given values 
    System.out.print("Sum of two values = ");
    System.out.println(value1 + value2);
    System.out.print("Difference of two values = ");
    System.out.println(value1 - value2);
    System.out.print("Product of two values = ");
    System.out.println(value1 * value2);
    System.out.print("Division of two values = ");
    System.out.println(value1 / value2);
    System.out.print("The remainder of the division = ");
    System.out.println(remainder);
    System.out.print("Minimum of the values = ");
    System.out.println(Math.min(value1 , value2));
    System.out.print("Maximum of the values = ");
    System.out.println(Math.max(value1,value2));
    
    
    
    
    input.close();
  }
}