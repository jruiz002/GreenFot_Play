import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skull here.
 * 
 * @author (Jose Ruiz y Diego Flores) 
 * @version (1.0.0)
 */
public class Skull extends Actor
{
    GifImage youLost = new GifImage("Skull_rotating.gif");
    /**
     * Act - do whatever the Skull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(youLost.getCurrentImage());
    }
}
