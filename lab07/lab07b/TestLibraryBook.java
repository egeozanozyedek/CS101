/*
 Name: Ege Ozan Özyedek
 Date: 29.11.2017
 Program Name: TestLibraryBook
 Program Description: Tests LibraryBook class
 */ 
public class TestLibraryBook
{
  public static void main( String[] args)
  {
    // constants
    // variables
    // program code
    
    LibraryBook book = new LibraryBook("Origin", "Dan Brown", "", 0, false );
    LibraryBook book2 = new LibraryBook("Game Of Thrones", "R.R. Martin");
    
    System.out.println(book.toString());
    System.out.println();
    System.out.println(book2.toString());
    
    System.out.println();
    
    book.loanBook("11/12/17");
    System.out.println("The book is loaned: " + book.onLoan() );
    System.out.println("Times book is loaned: " + book.getTimesLoaned() );
    
    System.out.println();
    
    book.returnBook();
    System.out.println("The book is loaned: " + book.onLoan() );
    
    System.out.println();
    
    book.loanBook("20/12/17");
    System.out.println("The book is loaned: " + book.onLoan() );
    System.out.println("Times book is loaned: " + book.getTimesLoaned() );
    
    System.out.println();
    
    System.out.println(book.toString());
    
    
    
    
    
  }
}
