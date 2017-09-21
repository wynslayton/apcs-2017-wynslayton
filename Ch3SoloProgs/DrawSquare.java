


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

/**/
}//end of main
}//end of class