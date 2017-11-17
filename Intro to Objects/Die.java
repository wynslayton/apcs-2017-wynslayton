//********************************************************************
//  Die.java
//
//********************************************************************

import java.util.Random;
public class Die
{
   private final int MIN_FACES = 4;


   private static Random generator = new Random();
   private int numFaces;   // number of sides on the die
   private int faceValue;  // current value showing on the die
   

   /**
     Defaults to a six-sided die. Initial face value is 1.
   */
   public Die ()
   {
      numFaces = 6;
      faceValue = 1;
   }

   /**
     constructor
     Explicitly sets the size of the die. Defaults to a size of
     six if the parameter is invalid < MIN_FACES.
     Initial face value is random.
     @parm int number of sides of the die
   */
  public Die (int number_of_faces){
      if (number_of_faces < 4)
      numFaces = 6;
      else
      numFaces = number_of_faces;
      faceValue = roll();
    }

   /**
        Rolls the die and returns the result.
        @return
   */
   public int roll ()
   {
      faceValue = generator.nextInt(numFaces)+1;
      return faceValue;
   }

   /**
        Returns the current die value.
        @return int face value
   */
   public int getFaceValue ()
   {
      return faceValue;
   }


  /**
        Returns the current number of faces the die has.
        @return int numFaces
  */
  public int getnumFaces(){
      return numFaces;
    }

  /**
        Sets the number of faces of the Die
        @param _________________
  */
  public void setnumFaces(int number_of_faces){
      if (number_of_faces >= 4){
          numFaces = number_of_faces;
    }
    else
    System.out.println("This is not enough faces");
}
/**
 * Sets the value on the the die
 * @param int faceValue
 */
  public void setfaceValue(int newval){
      if (0 < newval)
      faceValue = newval;
    }
   /**
        Returns the current die value and number of sides as a String.
        @return _____________
        if no toString it will return the class name and address
   */
   public String toString ()
   {
      String data ="This die has " + numFaces + " faces and it is showing the number " + faceValue + ".";



      return data;
   }




}//end of class Die
