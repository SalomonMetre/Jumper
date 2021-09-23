import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    static int nbCars=6;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        addObject(new Jumper(),50,250);
        for(int i=0;i<nbCars;i++)
            addObject(new Ball(),200+Greenfoot.getRandomNumber(500),30+Greenfoot.getRandomNumber(470));
    }
    
    public void displayScore(){
        showText("Score : "+ Jumper.score,350,20);
    }
    
    public void act(){
        displayScore();
    }
}
