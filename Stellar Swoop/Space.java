import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase describe el comportamiento el comportamiento del escenario con los objetos.
 * 
 * @author (Jose Ruiz y Diego Flores) 
 * @version (1.0.0)
 */
public class Space extends World
{
    private int enemy = 0;
    Scoreboard sc = new Scoreboard();
    public Space()
    {    
        // Se crea un escenario de 850X600.
        super(850, 600, 1, false);
        setPaintOrder(Scoreboard.class, Meteor.class, Astronaut.class);
        statePlay();
    }
    
    public void statePlay(){
        Astronaut astronaut = new Astronaut();
        addObject(astronaut, 20, 200);
        addObject(sc, 150, 50);
    }
    
    public Scoreboard getScoreboard(){
        return sc;
    }
    
    public void act(){
        if (enemy > 0){
            enemy--;
        }else{
            enemy = 20;
        }
        if (enemy == 1){
            int posY = Greenfoot.getRandomNumber(getHeight());
            addObject(new Meteor(-(2 + Greenfoot.getRandomNumber(3))),getWidth() + 200, posY);
        }
    }
}
