import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Plane, controlled by the player
 * 
 * @author Jacky Liang 
 * @version Jan 2023
 */
public class Plane extends Actor
{
    GreenfootImage planePic = new GreenfootImage("images/plane#1.png");
    GreenfootSound pew = new GreenfootSound("pew.mp3");
    MyWorld world = (MyWorld) getWorld();
    
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")) {
            move(-10);
        }
        if(Greenfoot.isKeyDown("right")) {
            move(10);
        }
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 10);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 10);
        }
        if(Greenfoot.isKeyDown("space") && (canShoot())) {
            shootGun();
        }
        planePic.scale(50,100);
        setImage(planePic);
    }
    
    /**
     *  Shoots a bullet out of the plane towards the enemies
     */
    public void shootGun() {
        MyWorld world = (MyWorld) getWorld();
        Bullet bullet = new Bullet();
        int x = getX();
        int y = getY();
        world.addObject(bullet,x,y);
        pew.play();
    }
    
    /**
     *  Checks to see if the airplane already has a bullet in the world to decide if its allowed to shoot or not.
     */
    public boolean canShoot() {
        return getWorld().getObjects(Bullet.class).size() < 1;
    }
}
