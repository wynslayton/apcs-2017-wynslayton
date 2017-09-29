//Wynant Slayton
//APCS p 2
//9/28/2017
//This program will tell you how much you weigh on any of the select planets
import java.util.*;
public class SolarSystemSwitch
{
    public static void main (String [] args)
    {
        //Defines variables
        Scanner scan = new Scanner(System.in);
        double weight;
        char planet;
        
        //Menu
        System.out.println("~~~~~~~~~~~~~~Pick Your Planet!~~~~~~~~~~~~~~");
        System.out.println("0: Mercury");
        System.out.println("1: Venus");
        System.out.println("2: The Moon");
        System.out.println("3: Mars");
        System.out.println("4: Jupiter");
        System.out.println("5: Saturn");
        System.out.println("6: Uranus");
        System.out.println("7: Neptune");
        System.out.println("8: Pluto");
        
        System.out.print("Your Selection? ");
        planet = scan.next().charAt(0);
        
        System.out.print("\nYour current weight? ");
        weight = scan.nextDouble();
        
        System.out.println("\n\nDrumroll Please\n\n");
        
        //Uses a switch to cascade down find, calculate, and print your weight
        switch (planet){
            case '0':
                weight = weight * 0.378;
                System.out.println("Your new weight is " + weight + " pounds!");
                break;
            case '1':
                weight = weight * 0.907;
                System.out.println("Your new weight is " + weight + " pounds!");
                break;
            case '2':
                weight = weight * 0.166;
                System.out.println("Your new weight is " + weight + " pounds!");
                break;
            case '3':
                weight = weight * 0.377;
                System.out.println("Your new weight is " + weight + " pounds!");
                break;
            case '4':
                weight = weight * 2.528;
                System.out.println("Your new weight is " + weight + " pounds!");
                break;
            case '5':
                weight = weight * 1.064;
                System.out.println("Your new weight is " + weight + " pounds!");
                break;
            case '6':
                weight = weight * 0.889;
                System.out.println("Your new weight is " + weight + " pounds!");
                break;
            case '7':
                weight = weight * 1.125;
                System.out.println("Your new weight is " + weight + " pounds!");
                break;
            case '8':
                weight = weight * 0.067;
                System.out.println("Your new weight is " + weight + " pounds!");
                break;
        }
    }//end of main
}//end of class
