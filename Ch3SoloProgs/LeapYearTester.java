//Wynant Slayton
//APCS p 2
//9/28/2017
//This program will test if a year is a leap year from the first year the gregorian calender was created
import java.util.*;
public class LeapYearTester
{
    public static void main (String [] args)
    {
        int year;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your year to be tested: ");
        year = scan.nextInt();
        if (year < 1582){
            System.out.println("\nNO CALENDER YET");
        }
        else if ((year % 4) == 0){
            if ((year % 100) == 0){
                if ((year % 400) == 0){
                    System.out.println("\nLeap Year!");
                }
                else{
                    System.out.println("\nNot a leap year.");
                }
            }
            else{
                System.out.println("\nLeap Year!");
            }
        }
        else{
            System.out.println("\nNot a leap year.");
        }
    }//end of main
}//end of class
