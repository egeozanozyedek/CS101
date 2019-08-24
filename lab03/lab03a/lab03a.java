import java.util.Scanner;

/*
 Name:Ege Ozan Özyedek
 Date:18.10.2017
 Program Description: Simple if statements
 Program Name:lab03a
 */ 

public class lab03a
{
  public static void main( String[] args)
  {
    Scanner input = new Scanner( System.in);
    
    //Variables
    int even ;
    int odd ;
    int sumFormula ;
    int sumLoop ;
    int n ;
    
    //Declaring some variables for the program
    even = 0 ;
    odd = 0 ;
    n = input.nextInt() ;
    sumFormula = (n*(n+1))/2 ;
    sumLoop = 0 ;
    
    for ( int x = 0; x <= 50; x++ ) 
    {
      //Computes the sum of numbers till n (including n)
      if (n >= x) {
        sumLoop = sumLoop + x ;
      }
      
      //If a number is not between 12-25 it will print the "out of range 12-25" statement
      if (!(12<= x && x<=25)){
        System.out.print(x);
        System.out.println (" out of range 12-25");
      }
      //If it is inbetween 12-25 it will print it out with no statement
      else {
        System.out.println (x);
      }
      
      //Determines the amount of even numbers
      if (x % 2 == 0) {
        even++ ;
      }
      
      //Determines the amount of odd numbers
      else if (x % 2 == 1) {
        odd++ ;
      }
      
      //The following 4 if/else statements print Hi Five/Two/ThreeOrSeven/Others depending on whether its dividable on a spesific number
      if (x % 5 == 0) {
        System.out.println (" Hi Five");
      }
      else if (x % 2 == 0) {
        System.out.println (" Hi Two");
      }
      else if (x % 3 == 0 || x % 7 == 0) {
        System.out.println (" Hi ThreeOrSeven");
      }
      else {
        System.out.println (" Hi Others");
      }
    }
    
    //These print out some of the values we found
    System.out.println ("");
    System.out.println ("The amount of odd numbers = " + odd);
    System.out.println ("The amount of even numbers = " + even);
    System.out.println ("The sum using the formula = " + sumFormula);
    System.out.println ("The sum using the loop = " + sumLoop);
    System.out.println ("The sum using the loop and the sum using the formula are the same! ");
    
    input.close();
  }
}