/**
 * This file is designed for CSE 8B SP20 PA6. 
 * 
 * @author  CSE8B SP20 PA Team
 */

/**
 * This is an abstract class that defines the Base region
 */
public abstract class BaseRegion implements Region {
    
    String name;
    char[][] grid; // 32*32
    
    public static final int ROWS = 32;
    public static final int COLS = 32;
    
    /**
     * No parameter constructor for BaseRegion
     * 
     */
    public BaseRegion() {
        this.name = "BaseRegion";
        grid = new char[ROWS][COLS];
    }
    
    /**
     * Method to get the name of BaseRegion
     * 
     * @return the name of the BaseRegion
     */
    public String getName() {
        return name;
    }
    
    /**
     * Method to get the area of BaseRegion
     * 
     * @return the area of the BaseRegion
     */
    public double getArea() {
        return 0;
    }
    
    /**
     * Method to get the perimeter of BaseRegion
     * 
     * @return the perimeter of the BaseRegion
     */
    public double getPerimeter() {
        return 0;
    }
    
    /**
     * Method to determine whether a given point lies within
     * the BaseRegion
     * 
     * @param p the Point to be checked 
     * @return  true if the point lies within the BaseRegion,
     *          false otherwise
     */
    public abstract boolean contains(Point p);
    
    /**
     * Method to draw the region onto the console
     * 
     */
    public void draw() {
        //TODO: Implement this method
    }
    
    /**
     * Method to print the details of the BaseRegion
     */
    public void printDetails() {
        //TODO: Implement this method
    }
    
    /**
     * Method to fill in the grid variable with X or .
     */
    public void fillGrid() {
        //TODO: Implement this method
    }
}
