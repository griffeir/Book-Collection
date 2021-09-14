import ecs100.*;
/**
 * Support class of Board
 * A ship stores a name, how large it is and how many times it has been hit 
 *
 * @author Ira
 * @version 14/09/21
 */
public class Ship
{
    // fields
    private String name; // name of the ship
    private int hitCount; // stores how many times a ship has been hit
    private int size; // stores the size of the ship
    

    /**
     * Constructor for objects of class Ship
     */
    public Ship(String name, int hitCount, int size)
    {
        // initialise instance variables
        this.name = name;
        this.hitCount = hitCount;
        this.size = size;
    }
    
    /**
     * Getter for Hit
     * 
     * @return hitCount
     */
    public int getHitCount() {
        return this.hitCount;   
    }
    
    /**
     * Getter for size
     * 
     * @return size
     */
    public int getSize() {
        return this.size;   
    }
}
