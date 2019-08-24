import java.util.Scanner;

/*
 Name: Ege Ozan Özyedek
 Date: 01.11.2017
 Program Name: lab05b
 Program Description: Table
 */ 
public class lab05b
{
  public static void main( String[] args)
  {
    Scanner input = new Scanner( System.in);
    
    // constants
    final int CELL = 6;
    final String p = "-";
    final String SPC = " ";
    
    // variables
    int col;
    int row;
    int rowUser;
    int colUser;
    int s;
    int c;
    
    
    // program code
    
    rowUser = input.nextInt();
    colUser = input.nextInt();
    
    //The coulmn and row numbers together
    
    System.out.println( "Row,Column Table");
    
    for ( row = 1; row <= rowUser; row++ ) {
      for ( col = 1; col <= colUser; col++ ) { 
        System.out.print( row + "," + col );
        for (s = String.valueOf( row + "," + col ).length() ; s<CELL ; s++){
          System.out.print(SPC);
        }
      }
      System.out.println( );
    }
    
    System.out.println( );
    
    //Product of the column and row number
    
    System.out.println( "Row * Column table");
    
    for ( row = 1; row <= rowUser; row++ ) {
      for ( col = 1; col <= colUser; col++ ){ 
        System.out.print( row * col );
        for (s = String.valueOf( row * col ).length() ; s<CELL ; s++){
          System.out.print(SPC);
        }
        
      }
      System.out.println();
    }
    
    System.out.println( );
    
    //The cell number beginning from 0 and increasing left to right, top to bottom 
    
    System.out.println( "A table that 0 increases left to right and top to bottom");
    
    c = 0;
    for ( row = 1; row <= rowUser; row++ ) {
      for (col = 1; col <= colUser; col++ ){
        if (c % colUser == 0 && c != 0){
          System.out.println( );
          System.out.print(c);
        }
        else if ( c == 0 ){
          System.out.print( c );
        }
        else {
          System.out.print( "," + c );
        }
        c++;
      }
      System.out.println();
    }
    
    System.out.println( );
    
    //the row number in the first column only, putting the String "-" into the other cells.
    
    System.out.println( "Row and - table");
    
    for ( row = 1; row <= rowUser; row++) {
      for (col = 1; col <= colUser; col++ ){ 
        if(col == 1){
          System.out.print( row);
        }
        else {
          System.out.print( "," + p);
        }
      }
      System.out.println();
    }
    
    input.close();
  }
  
}
