
package clue;
import java.awt.*;

public class Board {
    private final static int NUM_CONNECT_WIN = 4; 
    private final static int NUM_ROWS = 15;
    private final static int NUM_COLUMNS = 15;      
    private static Rooms board[][] = new Rooms[NUM_ROWS][NUM_COLUMNS];
    private Rooms.Type type;
    
//    public static void setRoom(){
//        for(int row=0;row<6;row++){
//            for(int col=0;col<6;col++){
//                board[row][col].setType(Rooms.Type.STUDY);
//                System.out.println("In set room");
//            }  
//        } 
//        
//    }

    public static void Draw(Graphics2D g) {
        System.out.println("In Draw1");
//Calculate the width and height of each board square.
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        
 //draw grid
        g.setColor(Color.black);
        for (int zi = 1;zi<NUM_ROWS;zi++)
        {
            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
                    Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
        }
        
        for (int zi = 1;zi<NUM_COLUMNS;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
        }    
        for (int zi = 0;zi<NUM_ROWS;zi++)
        {
            for (int zx = 0;zx<NUM_COLUMNS;zx++)
            {
                if (board[zi][zx] != null)
                {
//                    setRoom();
                    System.out.println("In Draw2");
                    board[zi][zx].draw(g,zi,zx,xdelta,ydelta);
                }
            }
        } 
    }
}
