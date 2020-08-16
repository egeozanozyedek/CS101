/*
 Name: Ege Ozan Özyedek
 Date: 16.12.2017
 Program Name: TestRationalNumber
 Program Description: A class that tests the RationalNumber class
 */ 
public class TestRationalNumber {
  
  
  public static void main(String[] args) {
    
    //variables
    RationalNumber x;
    RationalNumber y;
    RationalNumber z;
    
    //program code
    
    /*
     * x = 243/0 (will turn into 0/1 because denominator cannot be 0)
     * y = 756/15
     */
    x = new RationalNumber(243,0);
    y = new RationalNumber(756,15);
    
    z = x.add(y);
    
    System.out.println( x + " + " + y + " = " + z );
    
    z = x.subtract(y);
    
    System.out.println( x + " - " + y + " = " + z );
    
    z = x.multiply(y);
    
    System.out.println( x + " * " + y + " = " + z );
    
    z = x.division(y);
    
    System.out.println( x + " / " + y + " = " + z );
    
    z = x.reciprocal();
    
    System.out.println( x + " -reciprocal- " + z );
    
    System.out.println(x.isInteger());
    
    System.out.println(x.isZero());
    
    System.out.println(x.isLessThan(y));
    
    System.out.println(x.equals(y));
    
    System.out.println( "\n" + "----------" + "\n");
    
    /*
     * x = 625/25 
     * y = 542/-10 (will turn into -542/10 because denominator cannot be negative)
     */
    x = new RationalNumber(625,25);
    y = new RationalNumber(542,-10);
    
    z = x.add(y);
    
    System.out.println( x + " + " + y + " = " + z );
    
    z = x.subtract(y);
    
    System.out.println( x + " - " + y + " = " + z );
    
    z = x.multiply(y);
    
    System.out.println( x + " * " + y + " = " + z );
    
    z = x.division(y);
    
    System.out.println( x + " / " + y + " = " + z );
    
    z = x.reciprocal();
    
    System.out.println( x + " -reciprocal- " + z );
    
    System.out.println(x.isInteger());
    
    System.out.println(x.isZero());
    
    System.out.println(x.isLessThan(y));
    
    System.out.println(x.equals(y));
    
  } 
  
  
  
  
  
  
  
}