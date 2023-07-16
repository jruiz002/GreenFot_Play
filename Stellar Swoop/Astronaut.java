import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spacecraft here.
 * 
 * @author (Jose Ruiz y Diego Flores) 
 * @version (1.0.0)
 */
public class Astronaut extends Actor
{
    public int up = 1;
    public int down = 2;
    public int left = 3;
    public int right = 4;
    
    public void act()
    {
        if (Greenfoot.isKeyDown("up")){
            setDirection(up);
        }else if (Greenfoot.isKeyDown("right")){
            setDirection(right);
        }else if (Greenfoot.isKeyDown("left")){
            setDirection(left);
        }else if (Greenfoot.isKeyDown("down")){
            setDirection(down);
        }
    }
    
    public void setDirection(int direction){
        if (direction == 1){
            up();
        }
        if (direction == 2){
            down();
        }
        if (direction == 3) {
            left();
        }
        if (direction == 4) {
            right();
        }
    }
    
    public void up(){
        if (Greenfoot.isKeyDown("space")){
            int xpos = getX();
            int ypos = getY()-50;
            setLocation(xpos, ypos);
        }else{
            int xpos = getX();
            int ypos = getY()-5;
            setLocation(getX(), ypos);
        }
    }
    
    public void down(){
        if (Greenfoot.isKeyDown("space")){
            int xpos = getX();
            int ypos = getY()+50;
            setLocation(xpos, ypos);
        }else{
            int xpos = getX();
            int ypos = getY()+5;
            setLocation(getX(), ypos);
        }
    }
    
    public void left(){
        if (Greenfoot.isKeyDown("space")){
            int xpos = getX()-50;
            int ypos = getY();
            setLocation(xpos, ypos);
        }else{
            int xpos = getX()-5;
            int ypos = getY();
            setLocation(xpos, ypos);
        }
    }
    
    public void right(){
        if (Greenfoot.isKeyDown("space")){
            int xpos = getX()+50;
            int ypos = getY();
            setLocation(xpos, ypos);
        }else{
            int xpos = getX()+5;
            int ypos = getY();
            setLocation(xpos, ypos);
        }
    }
    
}