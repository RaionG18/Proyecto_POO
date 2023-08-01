import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Personaje personaje = new Personaje();
        addObject(personaje,248,368);
        Plataform plataform = new Plataform();
        addObject(plataform,225,298);
        Plataform plataform2 = new Plataform();
        addObject(plataform2,388,225);
        Plataform plataform3 = new Plataform();
        addObject(plataform3,247,148);
        Plataform plataform4 = new Plataform();
        addObject(plataform4,432,70);
    }
}
