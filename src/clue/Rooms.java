

package clue;
import java.io.*;
import javax.sound.sampled.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;

public class Rooms extends ClueCards{
    public static enum Type {
        KITCHEN,HALL,BALLROOM,LIBRARY,DINNINGROOM,LOUNGE,CONSERVATORY,STUDY,BILLIARDROOM
    };
    private Type type;
    
    public Rooms(Type _type){
        type= _type;
    }
    public void setType(Type _type) {
       type=_type;
    }
    public Type getType() {
       return(type);
    }
     public void draw(Graphics2D g,int row,int column,
    int xdelta,int ydelta) {
          System.out.println("In draw");
         if(type==Type.STUDY){
        g.setColor(Color.RED); 
        g.fillOval(Window.getX(column*xdelta),
        Window.getY(row*ydelta),xdelta,ydelta);
         }
        
    }
}
