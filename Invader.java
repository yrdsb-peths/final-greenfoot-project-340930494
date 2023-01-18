import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The that is attacking the player
 * 
 * @author Jacky Liang
 * @version Jan 2023
 */
public class Invader extends Actor
{
    GreenfootImage alien = new GreenfootImage("images/Invader.png");
    
    int speed = 1;
    /**
     * Act - do whatever the Invader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + speed);
        alien.scale(75,75);
        setImage(alien);
        // Kills the players plane
        MyWorld world = (MyWorld) getWorld();
        if(getY() == world.getHeight() - 1) {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    /**
     * Increases the speed of the enemy invaders
     */
    public void setSpeed(int spd) {
        speed = spd;
    }
}
