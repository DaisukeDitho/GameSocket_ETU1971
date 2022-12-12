package tools;

import javax.swing.*;
import java.awt.*;

public class Avatar extends JPanel
{
    int ID=666;
    int x=220;
    int y=220;
    int deplaceX=0;
    int deplaceY=0;

    public void setID(int id)
    {
        System.out.println("teto no nanome ID : "+id);
        this.ID=id;
    }
    public int getID()
    {
        return this.ID;
    }
    public void setX(int x)
    {
        System.out.println("X an"+ID+" miova");
        this.x=x;
    }
    public int getX()
    {
        return this.x;
    }
    public void setY(int y)
    {
        System.out.println("Y an"+ID+" miova");
        this.y=y;
    }
    public int getY()
    {
        return this.y;
    }    
    public void setdeplaceX(int deplaceX)
    {
        this.deplaceX=deplaceX;
    }
    public int getdeplaceX()
    {
        return this.deplaceX;
    }
    public void setdeplaceY(int deplaceY)
    {
        this.deplaceY=deplaceY;
    }
    public int getdeplaceY()
    {
        return this.deplaceY;
    }

    public Avatar(int ID)
    {
        setID(ID);
    }
    public Avatar()
    {
        
    }

    public void paint(Graphics g)
    {
        g.setColor(new Color(0,0,0));
        g.fillRect(getX(),getY(),10,10); 
    }
}