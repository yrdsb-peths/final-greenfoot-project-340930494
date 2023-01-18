import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Galaxy Invaders", 60);
        addObject(label,352,212);
        Plane plane = new Plane();
        addObject(plane,125,181);
        Bullet bullet = new Bullet();
        addObject(bullet,289,149);
        Bullet bullet2 = new Bullet();
        addObject(bullet2,426,197);
        Label label2 = new Label("Press <Space> To Start", 50);
        addObject(label2,363,313);
        plane.setLocation(137,192);
        bullet.setLocation(272,159);
        bullet2.setLocation(413,213);
        label.setLocation(341,63);
        label2.setLocation(381,345);
        plane.setRotation(90);
        bullet.setRotation(90);
        bullet2.setRotation(90);
        Invader invader = new Invader();
        addObject(invader,608,206);
        invader.setLocation(653,167);
        explode explode = new explode();
        addObject(explode,653,167);
        invader.setLocation(731,114);
        invader.setLocation(656,174);
        invader.setLocation(664,173);
        invader.setLocation(558,261);
        explode.setLocation(683,164);
        invader.setLocation(634,214);
        explode.setLocation(688,193);
        plane.setLocation(102,211);
        bullet.setLocation(245,156);
        bullet2.setLocation(309,233);
        invader.setLocation(523,174);
        invader.setLocation(455,264);
        explode.setLocation(525,193);
        Label label3 = new Label("Use \u2190 \u2191 \u2193 \u2192to Move", 30);
        addObject(label3,671,40);
        label3.setLocation(719,39);
        label3.setLocation(629,22);
        Label label4 = new Label("Use <SPACE> to Shoot", 30);
        addObject(label4,670,67);
        label4.setLocation(669,57);
        removeObject(plane);
        removeObject(bullet);
        removeObject(bullet2);
        removeObject(explode);
        removeObject(invader);
        propPlane propPlane = new propPlane();
        addObject(propPlane,103,204);
        propPlane.setRotation(90);
        propBullet propBullet = new propBullet();
        addObject(propBullet,238,157);
        propBullet propBullet2 = new propBullet();
        addObject(propBullet2,330,239);
        propBullet.setRotation(90);
        propBullet2.setRotation(90);
        propBullet propBullet3 = new propBullet();
        addObject(propBullet3,395,188);
        propBullet3.setRotation(90);
        propImage propImage = new propImage();
        addObject(propImage,542,233);
        propImage.setLocation(593,196);
        explode explode2 = new explode();
        addObject(explode2,593,196);
        propImage.setLocation(668,179);
        propImage.setLocation(550,181);
        explode2.setLocation(649,173);
        propImage.setLocation(586,238);
        propImage.setLocation(529,265);
        explode2.setLocation(580,216);
        explode2.setLocation(623,169);
        label2.setLocation(495,337);
        propImage.setLocation(518,232);
        label2.setLocation(469,348);
        label2.setLocation(463,347);
        propImage.setLocation(493,259);
        label2.setLocation(450,354);
        propImage.setLocation(564,227);
    }
}
