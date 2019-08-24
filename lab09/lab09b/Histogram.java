import java.util.ArrayList;

/*
 Name: Ege Ozan Özyedek
 Date: 13.12.2017
 Program Name: Histogram
 Program Description: Creates a frequency chart of how many 
 */ 
public class Histogram
{
  // properties
  private static ArrayList<Integer> store = new ArrayList<Integer>();
  private static Dice dice = new Dice();
  
  // constructors
  
  // methods
  
  public static void main( String[] args)
  {
    System.out.println( "\n" + histogram());
    System.out.println( store);
  }
  
  /**
   * Initializes ArrayList so that it has 11 elements that are 0
   * @param size which is the size the user enters
   */
  public static void createList( int size) {
    int n;
    for (n = 1; n <= size; n++) {
      store.add(0);
    }
  }
  
  /**
   * Rolls 1000 dice
   */
  public static void createData() {
    int n;
    int k;
    int roll;
    
    for (n = 1; n <= 1000; n++) {
      roll = dice.roll();
      store.set(roll-2, store.get(roll-2) + 1);
    }  
  }
  
  
  /**
   * Method to get the frequency by findig the max 
   * @return frequency
   */
  public static int getFreq() {
    int n;
    int k;
    int roll;
    int max;
    int freq;
    
    max = 0;
    createList(11);
    createData();
    
    for (n = 0; n < store.size() - 1; n++) {
      if (store.get(n) > max) {
        max = store.get(n);
      }
    }    
    
    freq = (int) max/10 ;
    return freq; 
    
  }
  
  /**
   * A histogram graph that show the frequency of the times a value has been rolled
   * @return the histogram chart
   */
  public static String histogram() {
    String result;
    int n;
    int k;
    int freq;
    
    result = "";
    freq = getFreq();
    
    for (n = 1 ; n <= 10; n++) {
      for (k = 0; k < store.size(); k++) {
        if (store.get(k) < freq * (11 - n) ) {
          result = result + " ";
        }
        else {
          result = result + "*";
        }
      }
      result = result + "\n";
    }
    return result;
  }
  
  
}