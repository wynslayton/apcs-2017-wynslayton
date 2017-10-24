import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class spiral{
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
        int x = 0, y = 0;
        while (y < 1000){
            pen.move(5 + x); pen.turn(75);
            x += 5;
            y ++;
        }
    }
}
