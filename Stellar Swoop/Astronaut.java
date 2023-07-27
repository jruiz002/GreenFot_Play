import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase describe el comportamiento del astronauta segun las flechas del teclado.
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
    public int laserDirection = 4;
    public boolean isAttacking = false;
    
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
        if((getX()>=getWorld().getWidth()-15) || (getX()<=15)){
            setLocation(40, getWorld().getHeight()/2);
        }else if((getY()>=getWorld().getHeight()-15) || (getY()<=15)){
            setLocation(40, getWorld().getHeight()/2);
        }
        attack(laserDirection);
    }
    
    public void setDirection(int direction){
        if (direction == 1){
            up();
            laserDirection = 4;
        }
        if (direction == 2){
            down();
            laserDirection = 4;
        }
        if (direction == 3) {
            left();
            laserDirection = 4;
        }
        if (direction == 4) {
            right();
            laserDirection = 4;
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
    
    public void attack(int laserDirection){
        if(isAttacking && Greenfoot.isKeyDown("x")){
            Laser myLaser = new Laser(laserDirection);
            getWorld().addObject(myLaser, getX(), getY());
            isAttacking = false;
        }
        if(!isAttacking && !Greenfoot.isKeyDown("x")){
            isAttacking= true;
        }
    }
    
}