/*
 Name: Ege Ozan Özyedek
 Date: 20.12.2017
 Program Name: lab10a
 Program Description: Tests BigNum class
 */ 
public class lab10a
{
  public static void main( String[] args)
  {
    // constants
    
    // variables
    BigNum b1 ;
    BigNum b2 ;
    BigNum b3 ;
    
    // program code
    
    b1= new BigNum();
    b2 = new BigNum("101");
    b3 = new BigNum("100");
    
    System.out.println(b1 + "\n" + b2 + "\n" + b3 + "\n");
    System.out.println(b1.isZero() + "\n" + b2.isZero() + "\n" + b3.isZero() + "\n");
    System.out.println(b1.equals(b2) + "\n" + b2.equals(b3) + "\n" + b3.equals(b2) + "\n" );
    
    
    
    System.out.println(b2.add(b3));
    
    System.out.println(b2 + "\n");
    
    System.out.println(b3.isLessThan(b2));
    
    
  }
  
}
