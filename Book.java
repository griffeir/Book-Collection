
/**
 * Class of books
 * Contains an id, name, author, quantity, image
 *
 * @author Ira
 * @version 25/5/21
 */
public class Book
{
    // fields
    private int id;
    private String name;
    private String author;
    private int quantity;
    private String image;   // to complete
    
    /**
     * Constructor to make the book object
     */
    public Book(int id, String nm, String auth, int qty, String img)
    {
        this.id = id;
        this.name = nm;
        this.author = auth;
        this.quantity = qty;
        this.image = img;
    }
    
    /**
     * Getter for ID
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Getter for Name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Getter for Author
     */
    public String getAuthor() {
        return this.author;
    }
    
    /**
     * Getter for Quantity
     */
    public int getQuantity() {
        return this.quantity;
    }
}
