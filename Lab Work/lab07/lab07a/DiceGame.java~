/*
 Name: Ege Ozan Özyedek
 Date: 29.11.2017
 Program Name: DiceGame
 Program Description: Rolls dice and returns the turns it took for both die to be 6
 */ 
public class DiceGame {
  
  // properties
  private Dice dice = new Dice();
  
  // constructors
  public DiceGame() {}
  
  // methods
  
  /**
   * Loops till both die values are 6 and counts the turns it take
   * @return turns it take to get both to be 6
   */
  public int play() {
    int count;
    count  = 0;
    while (dice.getDiceTotal() != 12) {
      dice.roll();
      count++;
    }
    return count;
  }
}