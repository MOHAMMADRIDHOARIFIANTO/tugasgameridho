import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lose extends World
{

    /**
     * Constructor for objects of class lose.
     * 
     */
    public lose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 478, 1);
        prepare();
    }
    public void prepare()
    {
        showText("score kamu:"+play.score.getValue(),150, 250);
    }
}
