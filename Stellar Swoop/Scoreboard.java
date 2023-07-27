import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Scoreboard here.
 * 
 * @author (Jose Ruiz y Diego Flores) 
 * @version (1.0.0)
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
        setImage(new GreenfootImage("Score: "+ score, 30, Color.WHITE, Color.BLACK ));
    }
    
    public void addScore(){
        score++;
    }
    
    public void resetScore(){
        score = 0;
    }
    
    public int getScore(){
        return score;
    }
}
