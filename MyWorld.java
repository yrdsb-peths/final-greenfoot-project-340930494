import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        //Creates a 800x400 cell world with a 1 pixel cell size.
        super(800, 400, 1);
        
        //Creates the redDevil plane object
        Plane redDevil = new Plane();
        
    }
}
