import java.util.Scanner;

/**
 Name: Ege Ozan Özyedek
 Date: 25.10.2017
 Program Name: lab04a
 Program Description: Simple while loops
 */ 

public class lab04a
{
  public static void main( String[] args)
  {
    Scanner input = new Scanner( System.in);
    
    // constants
    
    // variables
    int number;
    int count;
    double square;
    int divisor;
    double division;
    
    number = input.nextInt();
    count = 0;
    square = 0;
    divisor = 1;
    
    
    //Will print error message if invalid value is entered
    if ( number<=0 ) {
      System.out.println( "The value given is invalid. Please enter a positive value. ");
    }
    
    //Continues the program with valid values
    else {
      
      //Prints 0 to number given (exclusive) with spaces inbetween
      while ( count<number ) {
        System.out.print( count + " ");
        count++;
      }
      
      System.out.println( " " );
      
      //Resets the count
      count = 0;
      
      //Prints 0 to number given (exclusive) with five numbers per line and spaces inbetween
      while ( count<number ) {
        if ( count % 5 == 0  ) {
          System.out.println( " ");  
        }
        System.out.print( count + " ");
        count++;
      }
      
      System.out.println(" ");
      System.out.println( " " );
      
      //We declare count as number so that it can print out n to 0 inclusive 
      count = number;
      
      while ( 0 <= count ) {
        System.out.print( count + " ");
        count--;
      }
      
      System.out.println( " ");
      System.out.println( " " );
      
      //We declare count as negative number so that it can print -n to n inclusive
      count = - number;
      
      while ( count <= number ) {
        System.out.print( count + " " );
        count++;
      }
      
      
      System.out.println( " " );
      
      count = 0;
      
      //Prints squares of even numbers between 0 and number
      while ( count<number ) {
        if ( count % 10 == 0  ) {
          System.out.println( " " );  
        }
        if ( count % 2 == 0 ) {
          square = Math.pow(count,2);
          System.out.print( square + " ");
        }
        count++;
      }
      
      System.out.println( " ");
      System.out.println( " " );
      
      count = number;
      //Prints numbers that are divisable by 4 or 3 but not both between n and 3
      while (3<=count) {
        if ( count % 4 == 0 && count % 3 == 0 ) {
        }
        else if ( count % 4 == 0 ) {
          System.out.print( count + " " );
        }
        else if ( count % 3 == 0 ) {
          System.out.print( count + " " );
        }
        count--;
      }
      
      System.out.println( " " );
      System.out.println( " " );
      
      //Will show the divisors of given number
      while (divisor<number) {
        
        if (number % divisor == 0) {
          System.out.print(divisor + " ");
        }
        divisor++;
      }
      
      System.out.println( " " );
      System.out.println( " " );
      
      //Prints the division depending on if its higher than 0.01 or not
      count = 1;
      while ( count<=number ) {
        division = 1.0 / count;
        if( division > 0.01 ) {
          System.out.printf( "%.2f", division);
          System.out.print( " ");
        }
        count++;
      }
      
    }
    input.close();
  }
}
