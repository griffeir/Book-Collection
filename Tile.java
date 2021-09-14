import ecs100.*;
/**
 * Support class of board
 * A tile holds x, y coordinates
 * and whether or not a ship is currently on the tile
 *
 * @author Ira
 * @version 13/9/21
 */
public class Tile
{
    // fields
    private int x;
    private int y;
    private boolean ship;
    
    /**
     * Constructor for objects of class tile
     * 
     */
    public Tile(int x, int y, boolean ship) {
        //initialise instance variables
        this.x = x;
        this.y = y;
        this.ship = ship;
    }
    
    /**
     * Getter for x
     * 
     * @return x
     */
    public int getX() {
        return this.x;   
    }
    
    /**
     * Getter for y
     * 
     * @return y
     */
    public int getY() {
        return this.y;   
    }
    
    /**
     * Getter for Ship
     * 
     * @return ship
     */
    public boolean getShip() {
        return this.ship;   
    }
}
