public class lab06{
  public static void main( String[] args) {}
  
  /**
   * Calculates the yth power of input x
   * @param x an example input parameter
   * @param y another example input 
   * @return returns the yth power of x 
   */
  public static double power( double x, int y ) {
    int n;
    double result;
    
    result = 1;
    
    for (n = 1; n <= y; n++ ) {
      result = result * x;
    }
    return result;
  }
  
  /**
   * Calculates factorial of given number
   * @param n an example input parameter
   * @return returns the factorial calculation
   */
  public static int factorial( int n) {
    int a;
    int result;
    
    result = 1;
    
    for ( a = 1; a <= n; a++) {
      result = a * result;
    }
    return result;
  }
  
  /**
   * Reverses the inpt string
   * @param str an example input parameter
   * @return returns the reverse string result
   */
  public static String reverse( String str) {
    String result;
    int i;
    int length;
    
    result = "" ;
    length = str.length() ;
    
    for (i = length - 1; i >= 0; i-- ) {
      result = result + str.charAt(i) ;
    }
    return result;
  }
  
  /**
   * Converts base2 to decimal.
   * @param base2 an example input parameter
   * @return returns the binary result
   */
  public static int toDecimal( String base2) {
    
    int length;
    int x;
    int a;
    int result;
    int remain;
    int n;
    
    length = base2.length();
    x = Integer.parseInt(base2);
    result = 0;
    
    for ( n = 0; n<=length; n++ ) {
      remain = x%10;
      a = remain * (int)lab06.power(2,n);
      result = result + a;
      x = x/10;
    }
    return result;
  }
  
  
  
  /**
   * Converts decimals to base 2.
   * @param x an example input parameter 
   * @return returns the decimal result
   */
  public static String toBinary ( int x ) {
    
    String result;
    int remain;
    
    result = "";
    
    while ( x > 0) {
      remain = x % 2;
      result = result + remain;
      x = x / 2;
    }
    result = reverse( result);
    return result;
  }
  
  
  /**
   * This is a brief description of the method.
   * @param i an example input parameter
   * @param s another example input 
   * @return some useful result
   */
  public static double sin ( int x) {
    double radX;
    double result;
    double calc;
    int n;
    double term;
    
    radX = Math.toRadians( x);
    result = radX;
    term = radX;
    calc = 0;
    
    for ( n = 1; n <= 10; n++) {
      calc = power(-1,n) * power(radX,2) /((2 * n + 1) * (2 * n)) ;
      term = term * calc;
      result  = result + term;
    }
    
    
    return result;
  }
  
  
  
  
  
  
}






