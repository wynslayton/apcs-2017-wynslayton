//Wynant Slayton
//APCS p 2
//9/28/2017
//This program will test to see whether the doors on a minivan will be open or not
import java.util.*;
public class Minivan{ 
    public static void main (String [] args){
        char dl, dr, cl, mu, il, ir, ol, or, gear;
        int right, left;
        Scanner scan = new Scanner(System.in);
        String input = new String("");
        
        System.out.println("Please enter in the variables next to each other in the order of driver left, right, child lock, master unlock, inside left, inside right, outside left, outside right, and the gear.");
        
        input = scan.nextLine();
        
        dl = input.charAt(0);
        dr = input.charAt(1);
        cl = input.charAt(2);
        mu = input.charAt(3);
        il = input.charAt(4);
        ir = input.charAt(5);
        ol = input.charAt(6);
        or = input.charAt(7);
        gear = input.charAt(8);
        
        if (gear == "P"){
            if (mu == 1){
                if (cl == 0){
                    if (dl == 1 || il == 1 || ol == 1)
                }
                else{
                    
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

