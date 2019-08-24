import java.util.Scanner;

/**
 Name: Ege Ozan Özyedek
 Date: 25.10.2017
 Program Name: lab04b
 Program Description: Gets values from user and findss the max min value, sum and average 
 */ 

public class lab04b
{
  public static void main( String[] args)
  {
    Scanner input = new Scanner( System.in);
    
    //constants
    final int N = 100;
    
    // variableS
    double value;
    double sum;
    double maxValue;
    double minValue;
    double avg;
    double count;
    int loop;
    
    // program code
    sum = 0;
    minValue = ' ';
    maxValue = ' ';
    count = 0;
    loop = 0;
    
    //Will get 100 values from the user and find the max min values, sum all the values and find the avg of the values
    while ( loop<N ){
      value = input.nextInt();
      if ( value > maxValue ){
        maxValue = value;
      }
      if ( value < minValue ){ 
        minValue = value;
      }
      sum = sum + value;
      loop++;
      count++;
    } 
    
    avg = sum / count;
    
    System.out.println( "*Results* ");
    System.out.println( "The sum of the values is: " + sum);
    System.out.println( "The minimum value is: " + minValue);
    System.out.println( "The maximum value is: " + maxValue);
    System.out.println( "The average of the values is: " + avg);
    
    
    input.close();
  }
}
