import java.util.*;
import TurtleGraphics.StandardPen;
import java.awt.*;
import java.lang.Math;


public class fourle4f
{
    public static void main (String [] args){
        Random gen = new Random();
        StandardPen pen = new StandardPen();
        
        //x and y are coordinates, r is the r value, w is the theta value and z is the value of 1/100th of 2PI
        double x, y, r, w = 0, z;
        
        z = (2* Math.PI) /100;
        

        pen.up();
        
        for (int steps = 0; steps < 101; steps ++){
            
            w += z;
            r = Math.cos(2 * w);
            x = r * Math.cos(w);
            y = r * Math.sin(w);
            
            x *= 100;
            y *= 100;
            pen.move(x,y);
            
            pen.down();
            
        }
        
        
    }
}
