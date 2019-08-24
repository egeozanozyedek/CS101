import java.util.Scanner;
/*
 Name: Ege Ozan Özyedek
 Date: 29.11.2017
 Program Name: oldWay
 Program Description: Old way of dice game
 */ 
public class oldWay
{
  public static void main( String[] args)
  {
    
    // constants
    // variables
    int die1;
    int die2;
    int count;
    
    // program code
    
    die1 = 1;
    die2 = 1;
    count = 0;
    
    while (die1 != 6 && die2 != 6) {
      die1 = (int)( Math.random() * 6 + 1);
      die2 = (int)( Math.random() * 6 + 1);
      count++;
    }
    
    System.out.println("Old way: " + count);
  }
}
