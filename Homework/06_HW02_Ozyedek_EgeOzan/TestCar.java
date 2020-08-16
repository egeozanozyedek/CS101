/*
 Name: Ege Ozan Özyedek
 Date: 06.12.2017
 Program Name: TestCar
 Program Description: Tests the Car class by having two Car instances
 */ 
public class TestCar
{
  public static void main( String[] args)
  {  
    // constants
    
    // variables
    Car tesla;
    Car mini;
    
    // program code
    
    mini = new Car( 50);
    
    //Tank 20 gallons to mini
    mini.addGas( 20);
    System.out.println( "Gas Level mini: " + mini.getGasLevel());
    
    //Drive 200 miles with mini
    mini.drive( 200);
    System.out.println( "Gas Level mini after 200 miles: " + mini.getGasLevel() + "\n");
    
    tesla = new Car( 30);
    
    //Tank 700 gallons to tesla
    tesla.addGas( 700);
    System.out.println( "Gas Level tesla: " + tesla.getGasLevel());
    
    //Drive 6000 miles with tesla
    tesla.drive( 6000);
    System.out.println( "Gas Level tesla after 6000 miles: " + tesla.getGasLevel() + "\n");
    
  }
}
