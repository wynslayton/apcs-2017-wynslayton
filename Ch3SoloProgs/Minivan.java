//Wynant Slayton
//APCS p 2
//9/28/2017
//This program will test to see whether the doors on a minivan will be open or not
import java.util.*;
public class Minivan{ 
    public static void main (String [] args){
        char dl, dr, cl, mu, il, ir, ol, or, gear;
        Scanner scan = new Scanner(System.in);
        String inp = new String("");
        
        System.out.println("Please enter in the variables next to each other in the order of driver left, right, child lock, master unlock, inside left, inside right, outside left, outside right, and the gear.");
        
        inp = scan.nextLine();
        
        dl = inp.charAt(0);
        dr = inp.charAt(1);
        cl = inp.charAt(2);
        mu = inp.charAt(3);
        il = inp.charAt(4);
        ir = inp.charAt(5);
        ol = inp.charAt(6);
        or = inp.charAt(7);
        gear = inp.charAt(8);
        
        if (gear == 'P'){
            if (mu == 1){
                if (cl == 0){
                    if (dl == 1 || il == 1 || ol == 1){
                        System.out.println("Left door open.");
                    }
                    else{
                        System.out.println("Left door closed.");
                    }
                    if (dr == 1 || ir == 1 || or == 1){
                        System.out.println("Right door open.");
                    }
                    else{
                        System.out.println("Left door closed.");
                    }
                }
                else{
                    if (dl == 1 || ol == 1){
                        System.out.println("Left door open.");
                    }
                    else{
                        System.out.println("Left door closed.");
                    }
                    if (dr == 1 || or == 1){
                        System.out.println("Right door open.");
                    }
                    else{
                        System.out.println("Left door closed.");
                    }
                }
            }
            else{
                System.out.println("\nMaster unlock off.");
            }
        }
        else{
            System.out.println("\nNot in park.");
        }
    }//end of main
}//end of class

