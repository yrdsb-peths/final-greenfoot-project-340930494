import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the enemy the player will have to kill
 * 
 * @author Jacky Liang
 * @version Jan 2023
 */
public class Invader extends Actor
{
    /**
     * Act - do whatever the Invader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + 1);
        
        // Kills the players plane
        removeTouching(Plane.class);
    }
}
