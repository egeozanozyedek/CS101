/*
 Name: Ege Ozan Özyedek
 Date: 29.11.2017
 Program Name: Dice
 Program Description: Rolls dice and returns the face value of both die and total face value
 */ 
public class Dice {
  
  // properties
  private Die die1 = new Die();
  private Die die2 = new Die();
  
  // constructors
  public Dice() {}
  
  // methods
  
  /**
   * Rolls dice
   * @return total dice value
   */
  public int roll() {
    return die1.roll() + die2.roll();
  }
  
  /**
   * The first die's face value
   * @return die1's face value
   */
  public int getDie1FaceValue() {
    return die1.getFaceValue();
  }
  
  /**
   * The second die's face value
   * @return die2's face value
   */
  public int getDie2FaceValue() {
    return die2.getFaceValue();
  }
  
  /**
   * Returns total value
   * @return total dice value
   */
  public int getDiceTotal() {
    return die1.getFaceValue() + die2.getFaceValue();
  }
  
  /**
   * toString to make debugging easy
   * @return method returns
   */
  public String toString() {
    return "Roll: " + roll() + "\n" + "Face value of Die 1: " + getDie1FaceValue() + "\n" + "Face value of Die 2: " 
      + getDie2FaceValue() + "\n" + "Total: " + getDiceTotal();
  }
}