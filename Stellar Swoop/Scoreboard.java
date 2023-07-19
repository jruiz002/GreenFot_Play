import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int score = 0;
    public void act()
    {
        setImage(new GreenfootImage("Meteoritos destruidos: "+score, 30, Color.WHITE, Color.BLACK ));
    }
    
    public void addScore(){
        score++;
    }
    
    public void resetScore(){
        score = 0;
    }
}
