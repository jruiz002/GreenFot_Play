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
    Flecha flecha = new Flecha();
    public Menu()
    {    
        // Create a new world with 850x600 cells with a cell size of 1x1 pixels.
        super(850, 600, 1, false); 
        addObjects();
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("DOWN") && option !=1) option--;
        if (Greenfoot.isKeyDown("UP") && option !=0) option++;
        if (option >= 2) option = 0;
        if (option < 0) option = 1;
        flecha.setLocation(200, 300 + (option * 100));
        if (Greenfoot.isKeyDown("ENTER")){
            if (option == 0) Greenfoot.setWorld(new Space());
            if (option == 1) Greenfoot.stop();
        }
    }
    
    public void addObjects(){
        addObject(new Play(), 425, 300);
        addObject(new Exit(), 425, 400);
        addObject(flecha, 200, 300);
    }
}
