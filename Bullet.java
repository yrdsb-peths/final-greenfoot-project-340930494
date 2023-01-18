import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    GreenfootImage pew = new GreenfootImage("images/DerpyBullet.png");
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() - 40);
        pew.scale(50,50);
        setImage(pew);
        // Kills enemy upon contact
        MyWorld world = (MyWorld) getWorld();
        kill();
        
        
        if(getY() == 0) {
            world.removeObject(this);
        }
    }
    
    /**
     *  This method lets the bullet kill the invading alien which resuts in a new one attacking.
     */
    public void kill() {
        if(isTouching(Invader.class)) {
            removeTouching(Invader.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnEnemy();
            world.increaseScore();
        }
    }
}
