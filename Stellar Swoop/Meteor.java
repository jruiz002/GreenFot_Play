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
    
    public void destroy(){
        GreenfootSound dead = new GreenfootSound("../sounds/impact.mp3");
        Actor character = getOneObjectAtOffset(0, 0, Astronaut.class);
        if(character!=null){
            dead.setVolume(90);
            dead.play();
            GameOver lost = new GameOver();
            character.setLocation(20, 200);
            World myWorld = getWorld();
            Space mySpace = (Space)myWorld;
            mySpace.getSounds().stop();
            Scoreboard sc = mySpace.getScoreboard();
            lost.setLastScore(sc.getScore());
            Greenfoot.setWorld(lost);
        }
        
    }
    
    
    public void act()
    {
        move();
        destroy();
        if((getX()<=15)){
            getWorld().removeObject(this);
        }
    }
}