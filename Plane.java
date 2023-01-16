import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Plane, controlled by the player
 * 
 * @author (Jacky Liang) 
 * @version (Jan 2023)
 */
public class Plane extends Actor
{
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")) {
            move(-4);
        }
        if(Greenfoot.isKeyDown("right")) {
            move(4);
        }
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 4);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 4);
        }
        
        
    }
    
    /**
     *  Shoots a bullet out of the plane towards the enemies
     */
    public void shootGun() {
        if(Greenfoot.isKeyDown("a")) {
            MyWorld world = (MyWorld) getWorld();
            Bullet bullet = new Bullet();
            int x = getX();
            int y = getY();
            world.addObject(bullet, x, y);
        }
        
    }
}
