import java.util.Scanner;

/**
 Name: Ege Ozan Özyedek
 Date: 25.10.2017
 Program Name: lab04d
 Program Description: Creates a triangle with the width and character that the user chooses
 */ 

public class lab04d
{
  public static void main( String[] args)
  {
    Scanner input = new Scanner( System.in);
    
    // variables
    char ch;
    int width;
    int line;
    int count;
    
    //Input from the user
    ch = input.next().charAt( 0);
    width = input.nextInt();
    
    line =  0;
    
    /*The loop on the outside determines which line the inside count is going to print out
     * The inside loop dependes on 2 varaiables, count and line. Everytime the outside loop completes
     its turn, the count variable resets to 0 and because line increases, in the inside loop count loops the 
     amount of times as line. 
     */
    
    while ( line < width ) {
      line++;
      count = 0;
      while ( count < line ) { 
        System.out.print( ch);
        count++;
      }
      System.out.println( " ");
    }
    
    input.close();
  }
  
}
