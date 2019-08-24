/*
 Name: Ege Ozan Özyedek
 Date: 20.12.2017
 Program Name: BigNum
 Program Description: With constant SIZE and BASE, this class gets a value and creates an array with it.
 */ 
public class BigNum {
  
  //properties
  public static final int SIZE = 3;
  public static final int BASE = 2;
  private int[] array;
  //constructors
  
  /**
   * Constructor to assign 0
   * Sets all elements of array to 0
   */
  public BigNum() {
    array = new int[SIZE];
    for (int k = 0; k < SIZE; k++) {
      array[k] = 0;
    }
  }
  
  /**
   * Constructor to initialize the array of object
   * @param str, String of numbers to initialize array elements
   * Initializes the array using a for loop
   */
  public BigNum(String str) {
    array = new int[SIZE];
    int length = str.length();
    for (int n = 1; n <= SIZE; n++) {
      if (n <= length) {
        array [n - 1] = Character.getNumericValue(str.charAt(length-n));
      }
      else {
        array[n-1] = 0;
      }
    }
  }
  
  /**
   * A copy constructor
   * @param other, another BigNum
   * Equals the array of class to the other object's array
   */
  public BigNum(BigNum other) {
    for (int i = 0; i < SIZE; i++) {
      other.array[i] = array[i];
    }
  }
  
  //methods
  
  /**
   * ToString method to print the array elements
   * @return result which contains the array elements
   */
  public String toString() {
    String result = "[";
    for (int k = 0; k < SIZE; k++) {
      if (k == SIZE -1) {
        result = result + array[k];   
      }
      else {
        result = result + array[k] + ",";
      }
    }
    return result + "]" ;
  }
  
  /**
   * Determines whether the classand another object has equal array values
   * @param ther, another BigNum
   * @return true if two are equal
   */
  public boolean equals(BigNum other) {
    return array == other.array;
  }
  
  /**
   * A method to see if the object is zero
   * @return true or false depending on if the object is zero or not
   */
  public boolean isZero() {
    for (int k = 0; k < SIZE; k++) {
      if (array[k] !=0) {
        return false;
      }
    }
    return true;
  }
  
  /**
   * A method that shifts the elements left or right
   * @param left, if true it shifts the elements to the right 
   * by adding a zero to the left
   */
  public void shift(boolean left) {
    if (left) {  
      for (int k = array.length - 1 ; k > 0; k--) {
        array[k] = array[k-1];
      }
      array[0] = 0;  
    }
    else {
      for (int k = 1; k < array.length; k++) {
        array[k-1] = array[k];
      }
      array[array.length - 1] = 0;
    }
  }
  
  /**
   * A method to add another objects array to the existing one
   * @param other, another object to add it's method
   * @return the overflow
   */
  public int add(BigNum other) {
    String result;
    int remain;
    int sum;
    int i;
    
    result = "";
    remain = 0;
    for (i = 0; i < SIZE; i++) {
      sum = 0;
      sum = array[i] + other.array[i] + remain;
      
      if (sum >= BASE) {
        result = (sum - BASE) + result ;
        remain = 1;
      }
      else {
        remain = 0;
        result = sum + result ;
      }
    }
    
    //Remain being 1 means that there needs to be a number before result
    if (remain == 1) {
      result = "" + 1 + result;
    }
    
    System.out.println(result );
    int length = result.length();
    for (i = 0; i < SIZE; i++) {
      if (i <= length) {
        array [ i ] = Character.getNumericValue(result.charAt(length-(i + 1)));
      }
      else {
        array[ i ] = 0;
      }
    }
    
    if (result.length() > SIZE)
      return 1;
    else
      return 0;
  }
  
  /**
   * Determines if an object is less than the other
   * @param other, another BigNum
   * @return true or false whether the object is less than other
   */  
  public boolean isLessThan(BigNum other) { 
    boolean result;
    result = false;
    for (int i = SIZE; i > 0; i-- ) {
      
      if (array[i-1] < other.array[i-1]) {
        result = true;
      }
    }
    return result;
  }
  
}