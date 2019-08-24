import java.util.Scanner;

/**
 Name: Ege Ozan Özyedek
 Date: 25.10.2017
 Program Name: lab04c
 Program Description: Using sentinels to end programs
 */ 

public class lab04c
{
  public static void main( String[] args)
  {
    Scanner input = new Scanner( System.in);
    
    // variables
    int value;
    double sum;
    int maxValue;
    int minValue;
    double count;
    double avg;
    
    //Value is declared as 1 so that the loop can start
    value = 1;
    sum = 0;
    count = 0;
    maxValue = 0;
    minValue = ' ';
    
    //This will ask the user values and at the end it will print some values.
    //The program will stop if the user enters a negative value and will print the results.
    while ( 0<value ){
      value = input.nextInt();
      if ( value > maxValue && 0<value ){
        maxValue = value;
      }
      if ( value < minValue && 0<value ){ 
        minValue = value;
      }
      if ( 0<value ){
        sum = sum + value;
        count++;
      }
    }  
    
    avg = sum / count ;
    
    //The results that were concluded with the  values given by the user
    System.out.println( "Sum of all the positive values given: " + sum);
    System.out.println( "Average of all positive values given: " + avg);
    System.out.println( "Maximum value: " + maxValue );
    System.out.println( "Minimum value: " + minValue );
    
    input.close() ;
  }
}
