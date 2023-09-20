import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class malaikat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class malaikat extends Actor
{
    /**
     * Act - do whatever the malaikat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+5, getY());
        }
        penjahat a = (penjahat)getOneIntersectingObject(penjahat.class);
        if (a!=null){
            getWorld().removeObject(a);
            play.score.add(10);
        }
        rakyat b = (rakyat)getOneIntersectingObject(rakyat.class);
        if (b!=null){
            getWorld().removeObject(b);
            play.health.add(-1);
        }
    }
}
