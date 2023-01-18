import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main world where you play the game
 * 
 * @author Jacky Liang
 * @version Jan 2023
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 900, 1); 
        
        Plane plane = new Plane();
        addObject(plane, 300, 800);
        
        scoreLabel = new Label(0,50);
        addObject(scoreLabel, 300, 20);
        
        spawnEnemy();
    }
    
    /**
     * Spawns in an enemy at a random stop near the top of the playing field
     */
    public void spawnEnemy() {
        Invader invader = new Invader();
        invader.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 100;
        addObject(invader, x, y);
    }
    
    
    /**
     * Increase score method
     */
    public void increaseScore() {
        score+= 1000;
        scoreLabel.setValue(score);
        if(score % 5000 == 0 ) {
            level++;
        }
    }
}
