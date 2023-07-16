import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase describe el comportamiento que tendra el meteorito en el escenario.
 * 
 * @author (Jose Ruiz y Diego Flores) 
 * @version (1.0.0)
 */
public class Meteor extends Actor
{
    private int velocityX = 0;
    
    public Meteor(int velocidad){
        velocityX = velocidad;
    }
    
    public void move(){
        setLocation(getX() + velocityX, getY());        
    }
    
    public void act()
    {
        move();
    }
}