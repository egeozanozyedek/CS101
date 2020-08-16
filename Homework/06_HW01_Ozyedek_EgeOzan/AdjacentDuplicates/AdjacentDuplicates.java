import java.util.Scanner;

/*
 Name: Ege Ozan Özyedek
 Date: 01.11.2017
 Program Name: AdjacentDuplicates
 Program Description: Reads int from user and outputs the adjacent duplicates
 */ 
public class AdjacentDuplicates
{
  public static void main( String[] args)
  {
    Scanner input = new Scanner( System.in);
    
    // constants
    
    // variables
    int userInput;
    int ongoingInput;
    int a;
    
    // program code
    
    //userInput is the input that is being red, while ongoingInput will be the value before userInput 
    System.out.print( "Enter numbers:");
    userInput = input.nextInt();
    ongoingInput = userInput;
    a = 0;
    
    System.out.println( "Adjacent Duplicate, Occurance Count");
    
    //The while loop will end if the userInput is 0
    while ( userInput != 0 ) {
      
      
      if ( userInput == ongoingInput ) {
        a++;
      }
      
      if ( userInput != ongoingInput && a >= 2 ) {
        System.out.println(ongoingInput + "," + a);
        a= 1;
      }
      
      ongoingInput = userInput;
      userInput = input.nextInt();
      
      //Because the loop wont repeat if userInput is 0, this prevents the last value from not beign recognized 
      if ( userInput == 0 && a >= 2 ) {
        System.out.println( ongoingInput + "," + a );
      }
      
    } 
    input.close();
  }
}
