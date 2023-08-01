import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plataform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plataform extends Actor
{   
    // REF: https://www.cs.ubc.ca/~acton/techTrek/pengu/pengu.pdf
    private int speed = 4;
    private int leftTurn = 0;
    private int rightTurn = 500;
    
    public void act()
    {
        setLocation ( getX() + speed, getY() );
        Actor actor = getOneIntersectingObject(null);
        
        if(actor != null) {
            if (actor.getY() <= getY()){
                actor.setLocation ( actor.getX() + speed, actor.getY());
            }
            else{
                actor.setLocation ( actor.getX(), actor.getY() + 9);
            }
        }
        
        if (atTurningPoint()) {
            speed = -speed;
        }
    }
    
    public Plataform(){
        GreenfootImage image = getImage();  
        image.scale(80, 30);
        setImage(image);
    }
    
    public boolean atTurningPoint()
    {
        return (getX() <= leftTurn || getX() >= rightTurn);
    }
}
