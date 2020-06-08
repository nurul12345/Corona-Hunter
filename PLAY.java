import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PLAY here.
 * 
 * @author (nurul fatimah) 
 * @version (a version number or a date)
 */
public class PLAY extends Actor
{
    public void act() 
    {
        {if(Greenfoot.mousePressed(this)){
        getImage().scale((int)Math.round(getImage().getWidth()*0.9),(int)Math.round(getImage().getHeight()*0.9));
        }
      if(Greenfoot.mouseClicked(this)){
          Greenfoot.setWorld(new latar());
    }    
}
}
}