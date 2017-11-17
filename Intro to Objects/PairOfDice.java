// student outline of Pair of Dice

public class PairOfDice
{
    //private data-- 2 die

    private Die die1, die2;



    /**---------- Default Constructor
        Creates two six-sided Die objects, both with an initial
        face value of one.
    */
   public PairOfDice(){
      Die die1 = new Die();
     Die die2 = new Die();
    }



    /**----------- roll()
        Rolls both dice and returns the combined result.
        @return
    */
   public int droll()
   {
       int total = (die1.roll())+(die2.roll());
       return total;
    }


    /**-------------- getTotal()
        Returns the current combined dice total.
        @return
    */
   public int getTotal()
   {
       int total = (die1.getFaceValue())+(die2.getFaceValue());
       return total;
    }



    /**---------------- getDie1()
        Returns the current value of the first die.
        @return
    */
   public int getDie1()
   {
       return die1.getFaceValue();
    }

    /**------------- getDie2()
        Returns the current value of the second die.
        @return
    */
   public int getDie2()
   {
       return die2.getFaceValue();
    }

    /**------------- toString()
            Returns the current data for each die
            hint: use methods in die to build the String to return
            @return
    */
   public String toString()
   {
       
       String data;
       data = die2.toString() + die1.toString();
       return data;
    }



}
