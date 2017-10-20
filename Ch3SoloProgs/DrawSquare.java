


import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class DrawSquare
{
public static void main(String[] args)
{
    Random gen = new Random();
    StandardPen pen = new StandardPen();


    // puts the pen in the pos to start shape
    pen.up();
    pen.move(25);
    pen.turn(90); pen.move(25);
    pen.down();
    pen.setColor(Color.red);
    
    //circle
    for(int k = 0; k < 100; k ++){
        pen.move(5);
        pen.turn(3.6);
    }
    
    /*
    pen.move(50);
    pen.turn(90);
    pen.move(50);
    pen.turn(90);
    pen.move(50);
    pen.turn(90);
    pen.move(100);
    pen.turn(45);
    pen.move(50);
    pen.turn(157);
    pen.move(95);
    */

    pen.setColor(Color.red);

/**/
}//end of main
}//end of class