import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Personaje´principal que representa al jugador
 * 
 * Emilio Gordillo
 * Version 1.0
 */
public class Personaje extends Actor
{
    private int ySpeed;
    
    public void act()
    {   
        // REF: https://www.greenfoot.org/topics/3307#:~:text=To%20initially%20jump%2C%20you%20add,y%20direction%20each%20act%20method.
        int groundLevel = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == groundLevel);
        Actor actor = getOneIntersectingObject(null);
        
        if (!onGround && actor==null) // in middle of jump
        {   
            ySpeed++; // adds gravity effect
            setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)
            if(getY()>=groundLevel) // has landed (reached ground level)
            {
                setLocation(getX(), groundLevel); // set on ground
                Greenfoot.getKey(); // clears any key pressed during jump
            }
        }
        else// on ground or platform
        {
            Greenfoot.getKey(); // clears any key pressed during jump
            if ("space".equals(Greenfoot.getKey()) || Greenfoot.isKeyDown("Up") || Greenfoot.isKeyDown("W")) // jump key detected
            {
                ySpeed = -15; // add jump speed
                setLocation(getX(), getY()+ySpeed); // leave ground
            }
            Greenfoot.getKey(); // clears any key pressed during jump
        }
        
        if (Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("Left"))
        {
            move(-4);
        }
         
        if (Greenfoot.isKeyDown("D") || Greenfoot.isKeyDown("Right"))
        {
            move(4);
        }
    }
}
