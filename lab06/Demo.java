import java.util.Scanner;
/*
 * Name: Ege Ozan Özyedek
 * Date:
 * Program Name:
 * Program Description:
 */
public class Demo
{
  public static void main( String[] args)
  {
    Scanner input = new Scanner( System.in);
    
    // constants
    
    // variables
    String userBinary1;
    String userBinary2;
    int toD1;
    int toD2;
    int sumOfD;
    String userStr;
    int userX;
    double taylor1;
    double taylor2;
    double taylor3;
    double taylor;
    double sum;
    int n;
    double x;
    int userY;
    double sinY;
    double actualSinY;
    String reversedStr;
    
    // program code
    
    //Prints out a table that computes first/second/third/fourth power of n in the interval -1 to 10
    
    System.out.println( "Table for first/second/third/fourth power of n in the interval -1 to 10 ");
    for ( n = -1; n <= 10; n++) {
      
      System.out.print( lab06.power(n,1)+ " ");
      System.out.print( lab06.power(n,2)+ " ");
      System.out.print( lab06.power(n,3)+ " ");
      System.out.println( lab06.power(n,4)+ " ");
    }
    System.out.println( );
    
    //Prints out a table of n factorial
    
    System.out.println( "Table for n factorial, n in the interval 1 to 15");
    for (n = 1; n <= 15 ; n++) {
      
      System.out.print( n + " ");
      System.out.println( lab06.factorial(n));
      
    }
    
    System.out.println( );
    
    //Converts 2 inputs of binary to decimal and adds the two values of decimals
    System.out.println( "Enter first binary input ");
    userBinary1 = input.next();
    System.out.println( "Enter second binary input ");
    userBinary2 = input.next();
    
    toD1 = lab06.toDecimal(userBinary1);
    toD2 = lab06.toDecimal(userBinary2);
    sumOfD = toD1 +toD2;
    
    System.out.println( "Binary to decimal of the first input: " + toD1);
    System.out.println( "Binary to decimal of the second input: " + toD2);
    System.out.println( "Sum of the decimal values of two inputs: " + sumOfD);
    
    System.out.println( );
    
    
    //Reverses a word without reversing the whole sentence
    System.out.println( "Enter any sentence/word you like" );
    input.nextLine();
    userStr = input.nextLine() + " ";
    
    while (userStr.indexOf(" ") >= 0) {
      
      reversedStr = userStr.substring(0, userStr.indexOf(" ") +1);
      userStr = userStr.substring(userStr.indexOf(" ") + 1);
      
      System.out.print( lab06.reverse(reversedStr));
      
    }
    
    System.out.println( );
    
    
    
    //Finds the Taylor series exspension of sinx by getting a value from the user
    sum = 0;
    System.out.println( "Enter a x value in degrees");
    userX = input.nextInt();
    x =Math.toRadians(userX);
    for (n = 0; n<=10;n++ ){
      
      taylor1 = lab06.power(-1,n);
      taylor2 = lab06.power(x,(2 * n+1));
      taylor3 =lab06.factorial(2 * n +1);
      
      taylor = (taylor1 * taylor2 / taylor3);
      sum = sum + taylor;
      
      System.out.print(n + " | ");
      System.out.print(taylor1 + " | ");
      System.out.print(taylor2 + " | ");
      System.out.print(taylor3 + " | ");
      System.out.print(taylor + " | ");
      System.out.println(sum);
      
    }
    
    System.out.println( "The sin according to Taylor series exspansion: " + sum);
    System.out.println( );
    
    //Finds the sin using a created method and compares it with the Math.sin version
    System.out.println( "Enter a y value in degrees");
    userY = input.nextInt();
    
    sinY = lab06.sin( userY);
    actualSinY = Math.sin(Math.toRadians(userY));
    
    System.out.println( "The sin according to the method created: " + sinY);  
    System.out.println( "The sin according to Math.sin : " + actualSinY);
    
    
    input.close();
  }
}