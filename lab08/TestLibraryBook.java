/*
 Name: Ege Ozan Özyedek
 Date: 06.12.2017
 Program Name: TestLibraryBook
 Program Description: Tests LibraryBook class
 */ 
public class TestLibraryBook
{
  public static void main( String[] args)
  {
    // constants
    
    // variables
    LibraryBook bookI;
    LibraryBook bookII;
    // program code
    
    LibraryBook book1 = new LibraryBook("Origin", "Dan Brown", "", 0, false );
    LibraryBook book2 = new LibraryBook("Game Of Thrones", "R.R. Martin");
    bookII = new LibraryBook( book2);
    bookI = book1;
    
    System.out.println("Comparison" + "\n");
    System.out.println(book1 == bookI);          //Two references to a single object
    System.out.println(book1.equals(bookI));
    System.out.println(book2 == bookII);        //Two references to two individual objects with different properties
    System.out.println(book2.equals(bookII));         
    System.out.println(book1 == bookII);         //Two references to two individual objects with identical relevant properties
    System.out.println(book1.equals(bookII) + "\n" );  
    
    System.out.println(book1.hasSameAuthor(bookI));         //Should return true
    System.out.println(book1.hasSameAuthor(book2));         //Should return false
    System.out.println(book2.hasSameTitle(bookII));        //Should return true
    System.out.println(book2.hasSameTitle(book1) + "\n");   //Should return false
    
    System.out.println(book1.toString());
    System.out.println();
    System.out.println(book2.toString() + "\n" );
    
    book1.loanBook("11/12/17");
    System.out.println("The book is loaned: " + book1.onLoan() );
    System.out.println("Times book is loaned: " + book1.getTimesLoaned() + "\n" );
    
    book1.returnBook();
    System.out.println("The book is loaned: " + book1.onLoan() + "\n" );
    
    book1.loanBook("20/12/17");
    System.out.println("The book is loaned: " + book1.onLoan() );
    System.out.println("Times book is loaned: " + book1.getTimesLoaned() + "\n" );
    
    System.out.println(book1.toString());
    
  }
}
