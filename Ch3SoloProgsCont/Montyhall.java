import java.util.*;
public class Montyhall{
    public static void main ( String [] args){
        int stitch = 0, stay = 0, runs = 0, d, c;
        boolean d1 = false, d2 = false, d3 = false;
        Random rand = new Random();
        for (;runs < 1000; runs ++){
            //sets car
            d = rand.nextInt(3);
            if (d == 0){
                d1 = true;
            }
            else if (d == 0){
                d1 = true;
            }
            else{
                d1 = true;
            }
           
            //sets choice
            c = rand.nextInt(3);
            if (c == 0 && d1 == true){
                stay ++;
            }
            else if (c == 1 && d2 == true){
                stay ++;
            }
            else if (c == 2 && d3 == true){
                stay ++;
            }
            else{
                stitch ++;
            }
        }
        System.out.println("Switch: " + stitch + " Stay: " + stay);
    }//end of main
}// end of class
