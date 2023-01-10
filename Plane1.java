import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Plane #1 of the 14 options for the player to choose from
 * 
 * @author (Jacky) 
 * @version (Jan 2023)
 */
public class Plane1 extends Actor
{
    /**
     * Act - do whatever the Plane1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }
    
    GreenfoodImage redDevil = new GreenfootImage("images/plane#1.png");
    //Plane constructor
    public Plane1() {
            
            redDevil.scale(50,50);
        }
}
