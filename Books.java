import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import ecs100.*;

/**
 * Holds a collection of books in a hashmap
 * Allows a user to add, find, print all, edit, delete from a menu
 * Prevent the user from adding a duplicate book
 * Prevent user from being able to add more than 20 titles
 *
 * @author Ira
 * @version 25/5/21
 */
public class Books
{
    // instance variables 
    private HashMap<Integer, Book> booksMap;        // declaring the hashmap
    private int currBookId;                         // stores the current Id of the book being added

    /**
     * Constructor for objects of class Books
     */
    public Books()
    {
        // initialise hashmap
        booksMap = new HashMap<Integer, Book>();    // initialise hashmap
        
        // Creating Books
        Book b1 = new Book(1, "Pet Semetary", "Stephen King", 8, "casey-left-frown.png");
        Book b2 = new Book(2, "Otherland", "Tad Williams", 3, "casey-right-frown.png");
        Book b3 = new Book(3, "The Holy Bible", "Jesus Christ", 100, "casey-left-smile.png");
        
        // Adding books to map
        booksMap.put(1, b1);
        booksMap.put(2, b2);
        booksMap.put(3, b3);
        
        currBookId = 3;
        menu();
    }
    
    public void addBook()
    {
        final int MAX_QUANTITY = 99;
        int quantity = -1;
        
        String name = UI.askString("Name: ");
        String author = UI.askString("Author: ");
        do {
            quantity = UI.askInt("Quantity: ");
        } while (0 > quantity && quantity < MAX_QUANTITY);
        currBookId++;
        String imgFileName = UIFileChooser.open("Choose Image File: ");
        booksMap.put(currBookId, new Book(currBookId, name, author,
                                          quantity, imgFileName));
    }
    
    public void findBook()
    {
        int bookId = UI.askInt("Id: "); // Finds book based on Id, should be title
        booksMap.get(bookId).getName();
        
    }
    
    public void printAll()
    {
        // Traversing map
        for (int bookId : booksMap.keySet()) {
            UI.println(bookId + "Details: ");
            UI.println(booksMap.get(bookId).getName() + " "
                     + booksMap.get(bookId).getQuantity() + " "
                     + booksMap.get(bookId).getAuthor() + " ");
                    }
    }
    
    /**
     * Menu to print and call appropriate methods
     */
    public void menu()
    {
        // List of options
        ArrayList<String> choices = new ArrayList<>(Arrays.asList("A", "P", "Q"));
        
        // Print menu and and force choice
        String choice;
        do {
            UI.println("(A)dd a book");
            UI.println("(F)ind a book");
            UI.println("(P)rint all");
            UI.println("(Q)uit");
            choice = UI.askString("Enter a choice");
            
            if (choice.equalsIgnoreCase("A")){
                addBook();
            } else if (choice.equalsIgnoreCase("F")){
                findBook();
            } else if (choice.equalsIgnoreCase("P")){
                printAll();
            } else if (choice.equalsIgnoreCase("Q")){
                UI.println("cya");
                break;
            } else {
                UI.println("Ain't a choice");
            }
        } while (!choices.contains(choice));
        
    }
    
    /**
     * Main routine
     */
    public static void main(String[] args)
    {
        Books bk = new Books();
        
        
    }
}
