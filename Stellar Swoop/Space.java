import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Jose Ruiz y Diego Flores) 
 * @version (1.0.0)
 */
public class Space extends World
{
    public Space()
    {    
        // Se crea un escenario de 850X600.
        super(850, 600, 1);
        statePlay();
    }
    
    public void statePlay(){
        Astronaut astronaut = new Astronaut();
        addObject(astronaut, 20, 200);
    }
    

    
}
