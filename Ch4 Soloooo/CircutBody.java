
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
            System.out.println("Wat switch u wanna togl? won or too?");
            int sw = scan.nextInt();
            if (sw == 1)
                circut.toggleFirstSwitch();
                else if (sw == 2)
                circut.toggleSecondSwitch();
                else
                System.out.println("Boy you dumb XD");
            System.out.println("U wann togl 'gain?");
            onoff = scan.nextInt();
            }


}
}
