/*
 Name: Ege Ozan Özyedek
 Date: 29.11.2017
 Program Name: TestDie
 Program Description: Tests Die class
 */ 
public class TestDie {
  
  public static void main( String[] args)
  {
    Die x;
    Die y;
    x = new Die ();
    y = new Die ();
    
    // constants
    
    // variables
    int xValue;
    int yValue;
    
    // program code
    
    xValue = x.roll();
    yValue = y.roll();
    
    System.out.print(xValue + ", ");
    System.out.println(x.getFaceValue());
    System.out.print(yValue + ", ");
    System.out.println(y.getFaceValue()); 
  }
}