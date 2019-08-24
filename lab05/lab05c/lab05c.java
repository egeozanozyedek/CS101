import java.util.Scanner;

/*
 Name: Ege Ozan Özyedek
 Date: 01.11.2017
 Program Name: lab005c
 Program Description: Simple Calculator
 */ 
public class lab05c
{
  public static void main( String[] args)
  {
    Scanner input = new Scanner( System.in);
    
    // constants
    final String QUIT = "Quit" ;
    final String Q = "Q" ;
    final String CLEAR = "Clear";
    final String C = "C";
    final String PLUS = "+";
    final String MINUS = "-";
    final String MULTIPLY = "*";
    final String DIVIDE = "/" ;
    final String SIN = "sin";
    final int MAX = Integer.MAX_VALUE ;
    
    
    // variables
    String userInput;
    double number;
    double current ;
    String operator;
    double num;
    String numberAsString ;
    int length;
    boolean loopCondition;
    double compSin;
    int fact;
    double i;
    double n;
    double j;
    double res;
    double sum;
    
    
    // program code
    
    i = 1;
    current = 0;
    loopCondition = true;
    
    do {
      //Prints out the interface
      System.out.println( "");
      System.out.println( "Welcome to SimpleClac");
      System.out.println( "---------------------");
      System.out.println( "[" + current + "]");
      System.out.println( "---------------------");
      System.out.println( "+,-,*,/  value");
      System.out.println( "sin");
      System.out.println( "Clear");
      System.out.println( "Quit");
      System.out.println( "---------------------");
      System.out.print( "Select:");
      
      
      userInput = input.next();
      
      //If user enters clear it will set the current value to 0
      if (userInput.equalsIgnoreCase(CLEAR) || userInput.equalsIgnoreCase(C)) {
        current = 0;
      }
      //If the user enters quit it will quit the program
      else if (userInput.equalsIgnoreCase(QUIT) || userInput.equalsIgnoreCase(Q)) {
        loopCondition = false;
      }
      //If the user enters sin it will calculate the sin of current value
      else if ( userInput.equalsIgnoreCase( SIN) ) {
        
        System.out.println( "Using Math.sin()");
        compSin=Math.sin( Math.toRadians(current));
        System.out.println( compSin);
        System.out.println();
        
        System.out.println( "Using the Taylor series expansion formula to compute it using a fixed number ");
        
        sum = 0;
        for ( n = 0; n <= 10; n++ ) {
          i = 1;
          for ( j = 1; j <= 2 * n +1; j++ ) {
            i = i * j;
          }
          res = Math.pow( -1,n) * Math.pow( current, 2*n +1) / i;
          sum = res + sum;
        }
        System.out.println( sum);
        
        System.out.println( "Using the Taylor series expansion formula to compute it to a specified accuracy");
        
        sum = 0;
        for ( n = 0; n <= 10  ; n++ ) {
          i = 1;
          for ( j = 1; j <= 2 * n +1; j++ ) {
            i = i * j;
          }
          res = Math.pow( -1,n) * Math.pow( current, 2*n +1) / i;
          sum = res + sum;
        }
        
        System.out.println( sum - compSin );
      }
      
      //If the user enters +,-,*,/ and a value then it will calculate 
      else{
        
        operator = userInput.substring(0,1);
        length = userInput.length();
        numberAsString = userInput.substring(1,length);
        num = Double.parseDouble(numberAsString);
        
        if( operator.equals( PLUS ) ) {
          current = current + num;
        }
        if( operator.equals( MINUS ) ) {
          current = current - num;
        }
        if( operator.equals( MULTIPLY ) ) {
          current = current * num;
        }
        if( operator.equals( DIVIDE ) ) {
          if ( num == 0) {
            System.out.println( "You cannot divide by 0");
          }
          else {
            current = current / num;
          }  
        }
      }
      
    } while ( loopCondition == true ) ;
    
    System.out.println("Goodbye");
    
    input.close();
  }
  
}
