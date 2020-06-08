import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (nurul fatimah) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 700, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        EXIT exit = new EXIT();
        addObject(exit,396,448);
        PLAY play = new PLAY();
        addObject(play,170,352);
        exit.setLocation(370,443);
        exit.setLocation(363,442);
    }
}
