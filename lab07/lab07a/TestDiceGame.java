/*
 Name: Ege Ozan Özyedek
 Date: 29.11.2017
 Program Name: TestDiceGame
 Program Description: Tests DiceGame class
 */ 
public class TestDiceGame {
  
  public static void main( String[] args)
  {
    DiceGame x;
    x = new DiceGame();
    
    // constants
    
    // variables
    int game;
    
    // program code
    
    game = x.play();
    
    System.out.println("Turns it took to get both die to be 6: " + game);
  }
}