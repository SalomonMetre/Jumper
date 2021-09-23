import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Jumper extends Actor
{
    static int score=0;
    Jumper(){
        setLocation(50,50);
    }
    
    public void jump(){
        setLocation(getX(),getY()+5);
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-8);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+5,getY());
        }
    }
    
    public void act()
    {
        // Add your action code here.
        jump();
    }
}
