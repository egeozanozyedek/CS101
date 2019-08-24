import java.util.Scanner;

/*
 Name: Ege Ozan Özyedek
 Date: 06.12.2017
 Program Name:TestLibrary
 Program Description: Tests Library Class by creating a program that imitates a library system.
 */ 
public class TestLibrary
{
  public static void main( String[] args)
  {
    Scanner input = new Scanner( System.in);
    Library theLibrary = new Library();
    
    // constants
    
    // variables
    String userInput;
    String userInputA;
    String inputTitle;
    String inputDueDate;
    String inputAuthor;
    boolean controller;
    LibraryBook book;
    
    // program code
    
    userInput = "";
    userInputA = "";
    inputDueDate = "";
    controller = true;
    
    System.out.println( "Welcome to The Library!");
    
    //While loop so that the program can continue till the input is exit
    while ( controller) { 
      
      System.out.println( "\n" + "Show//Find//Add//Exit");
      userInput = input.next();
      
      //If the user enters exit, it stops the loop
      if ( userInput.equalsIgnoreCase( "Exit")) {
        controller = false;
      }
      //If show is entered the code will print toString method
      if ( userInput.equalsIgnoreCase( "Show")) {
        System.out.println( "--Books in the library--");
        System.out.println( theLibrary.toString());
      }
      
      //If find is entered the code wil continue this way
      if ( userInput.equalsIgnoreCase( "Find")) {
        
        System.out.println( "Enter the title of the book");
        input.nextLine();
        userInputA = input.nextLine();
        book = theLibrary.findByTitle( userInputA);
        
        //If the book exists the code will continue this way
        if ( book != null) {
          
          System.out.println( book.toString());
          System.out.println( "Loan//Return//Remove");
          userInputA = input.next();
          
          //If loan is entered the user will input a due date
          //If the book is on loan it will print an error message
          if ( userInputA.equalsIgnoreCase( "Loan")) {
            
            if (!book.onLoan()) {
              
              System.out.println( "Enter due date");
              inputDueDate = input.next();
              book.loanBook( inputDueDate);
              System.out.println( "The book is loaned!");
              
            }
            
            else {
              System.out.println( "This book is already on loan, therefore you cannot loan this book.");
            }
            
          }
          
          //If user inputs remove the book will be removed
          //The program already checked whether the book exists or not so its not needed here
          if ( userInputA.equalsIgnoreCase( "Remove")) {
            theLibrary.remove( book);
            System.out.println( "The book is removed!");
          }
          
          //If user inputs return it will return the book when its on loan 
          //and print an error message if its not on loan
          if ( userInputA.equalsIgnoreCase( "Return")) {
            
            if(book.onLoan()) {
              book.returnBook();
              System.out.println( "The book is returned!");
            }
            
            else {
              System.out.println( "This book is not loaned, therefore it connot be returned.");
            }
            
          }
          
        }
        
        //If there is no book with the input title it will print an error message
        else {
          System.out.println( "There is no book with such title");
        }
        
      }
      //If add is entered the code will give options to enter author and title
      if ( userInput.equalsIgnoreCase( "Add")) {
        System.out.println( "Enter book title");
        input.nextLine();
        inputTitle = input.nextLine();
        System.out.println( "Enter book author");
        inputAuthor = input.nextLine();
        theLibrary.add( inputTitle, inputAuthor);
        
        //With the control variable in the Library class this controls whether the library is full or not
        if (theLibrary.control) {
          System.out.println( "Book you requested has been added to the library!");
        }
        
      }
      
    }
    
    System.out.println( "Goodbye!");
    input.close();
  }
}