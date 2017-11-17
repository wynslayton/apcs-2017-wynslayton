//********************************************************************
//  SnakeEyes.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a class with overloaded constructors.
//********************************************************************

public class SnakeEyes
{
   //-----------------------------------------------------------------
   //  Creates two die objects, then rolls both dice a set number of
   //  times, counting the number of snake eyes that occur.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int ROLLS = 500;
      int snakeEyes = 0, num1, num2;

      Die die1 = new Die();    // creates a six-sided die
      Die die2 = new Die(20);  // creates a twenty-sided die
      Die die3 = new Die(1);  // creates an invalid die -- so sides are 6
      
      System.out.println(die1.getnumFaces());
      System.out.println(die2.getnumFaces());
      System.out.println(die3.getnumFaces());
      
      for (int roll = 1; roll <= ROLLS; roll++)
      {
          if (die1.roll() == 1 && die3.roll() == 1){
              snakeEyes ++;
            }
          System.out.println(die1.roll());
         

      }

      System.out.println ("Number of rolls: " + ROLLS);
      System.out.println ("Number of snake eyes: " + snakeEyes);
      System.out.println ("Ratio: " + (double)snakeEyes/ROLLS);

      System.out.println(die3.getFaceValue() );
      System.out.println(die2);
      
   }
}
