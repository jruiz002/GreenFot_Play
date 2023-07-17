import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int laserDirection;
    private final int MOVEMENT = 7;
    
    public Laser(int laserDirection){
        this.laserDirection = laserDirection;
    }
    
    public void act()
    {
        laserMovement();
        if((getX()>=getWorld().getWidth()-15) ||(getX()<=15)){
            getWorld().removeObject(this);
        }else if((getY()>=getWorld().getHeight()-15) || (getY()<=15)){
            getWorld().removeObject(this);
        }
    }
    
    public void laserMovement(){
        switch(laserDirection){
            case 1:
            setLocation(getX(), getY()-MOVEMENT);
            setRotation(270);
            break;
            
            case 2:
            setLocation(getX(), getY()+MOVEMENT);
            setRotation(90);
            break;
            
            case 3:
            setLocation(getX()-MOVEMENT, getY());
            setRotation(180);
            break;
            
            case 4:
            setLocation(getX()+MOVEMENT, getY());
            setRotation(0);
            break;
        }
        
        
    }
}
