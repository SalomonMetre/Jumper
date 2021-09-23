import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ball extends Actor
{
    public void moveBall(){
        move(-3);
        if(getX()<=2){
            setLocation(690,10+Greenfoot.getRandomNumber(490));
            Jumper.score++;
        }
        Actor hitJumper=getOneObjectAtOffset(0,0,Jumper.class);
        if(hitJumper!=null){
            getWorld().removeObject(hitJumper);
            getWorld().showText("GAME OVER !!!",350,250);
            Greenfoot.stop();
        }
    }
    public void act()
    {
        // Add your action code here.
        moveBall();
    }
}
