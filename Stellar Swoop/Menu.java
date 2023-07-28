import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase describe el comportamiendo del menú de inicio.
 * 
 * @author (Jose Ruiz y Diego Flores) 
 * @version (1.0.0)
 */
public class Menu extends World
{
    public int option = 0;
    private boolean isMoving = false;
    Flecha flecha = new Flecha();
    private GreenfootSound background = new GreenfootSound("../sounds/menu_music.mp3");
    public Menu()
    {    
        // Create a new world with 850x600 cells with a cell size of 1x1 pixels.
        super(850, 600, 1, false); 
        addObjects();
        
    }
    
    public void act(){
        background.setVolume(70);
        background.playLoop();
        keyControl();
    }
    
    public void keyControl(){
        if (Greenfoot.isKeyDown("DOWN") && option !=1) option--;
        if (Greenfoot.isKeyDown("UP") && option !=0) option++;
        if (option >= 2) option = 0;
        if (option < 0) option = 1;
        flecha.setLocation(200, 300 + (option * 100));
        if(isMoving && Greenfoot.isKeyDown("ENTER")){
            background.stop();
            setSound(50, "../sounds/success.mp3");
            if (option == 0) Greenfoot.setWorld(new Space());
            if (option == 1) Greenfoot.stop();
            isMoving = false;
        }
        if(!isMoving && !Greenfoot.isKeyDown("ENTER")){
            isMoving= true;
            
        }
        
    }
    
    public void setSound(int vol, String name){
        GreenfootSound go = new GreenfootSound(name);
        go.setVolume(vol);
        go.play();
    }
    public void addObjects(){
        addObject(new Play(), 425, 300);
        addObject(new Exit(), 425, 400);
        addObject(flecha, 200, 300);
    }
}
