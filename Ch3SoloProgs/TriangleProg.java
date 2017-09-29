//Wynant Slayton
//Mr Hayes
//9/22/2017
//This program will take any 3 sides or angles of a triangle and return what kind of a triangle it is

import java.util.*;
public class TriangleProg
{
    public static void main( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        double a, b, c, choice;
        System.out.println("Would you like to test in angles (1) or side lengths (2)? ");
        choice = scan.nextDouble();
        System.out.println("\nPlease enter your 3 values");
        System.out.print("Value 1:");
        a = scan.nextDouble();
        System.out.print("\nValue 2:");
        b = scan.nextDouble();
        System.out.print("\nValue 3:");
        c = scan.nextDouble();
        
        if (a == 0 || b == 0 || c == 0){
            System.out.println("\nIt doesn't work, you're bad");
        }
        else if (choice == 1.0){
            if ((a + b + c) == 180.0){
                System.out.println("\nIt works!");
            }
            else{System.out.println("\nIt doesn't work, you're bad");}
        }
        else{
            if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)){
                System.out.println("\nIt works!");
            }
            else{System.out.println("\nIt doesn't work, you're bad");}
        }
    }//end of main
}//end of class
