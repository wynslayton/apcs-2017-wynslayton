
import java.util.*;
/**
 * Write a description of class CircutBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CircutBody
{
    public static void main(String [] args)
    {
        Circut circut = new Circut();
        Scanner scan = new Scanner(System.in);
        System.out.println(circut);
        int onoff = 0;
        while (onoff != 1){
            System.out.println("Pick your switch to toggle? 1 or 2?");
            int sw = scan.nextInt();
            if (sw == 1)
                circut.toggleFirstSwitch();
                else if (sw == 2)
                circut.toggleSecondSwitch();
                else
                System.out.println("Somebody needs to learn how to count...");
            System.out.println("Do you wanna toggle again? (0 for yes) ");
            onoff = scan.nextInt();
            }


}
}
