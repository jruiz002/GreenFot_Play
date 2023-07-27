import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (Jose Ruiz y Diego Flores) 
 * @version (1.0.0)
 */
public class GameOver extends World
{
    private int option = 0;
    private int lastScore;
    private Flecha flecha = new Flecha();
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        super(850, 600, 1, false);
        addOptions();
    }
    
    public void setLastScore(int lastScore){
        this.lastScore = lastScore;
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("DOWN") && option !=1) option--;
        if (Greenfoot.isKeyDown("UP") && option !=0) option++;
        if (option >= 2) option = 0;
        if (option < 0) option = 1;
        flecha.setLocation(200, 400 + (option * 100));
        if (Greenfoot.isKeyDown("ENTER")){
            if (option == 0) Greenfoot.setWorld(new Space());
            if (option == 1) Greenfoot.setWorld(new Menu());
        }
        setText();
    }
    
    public void setText(){
        getBackground().drawImage(new GreenfootImage("GAME OVER", 100, Color.GREEN, Color.BLACK), 175, 125);
        getBackground().drawImage(new GreenfootImage("Your Score: "+lastScore, 50, Color.GREEN, Color.BLACK), 300, 250);
    }
    
    public void addOptions(){
        addObject(new Replay(), 420, 400);
        addObject(new Exit(), 420, 500);
        addObject(new Skull(), 115, 165);
        addObject(new Skull(), 750, 165);
        addObject(flecha, 200, 400);
    }
}
