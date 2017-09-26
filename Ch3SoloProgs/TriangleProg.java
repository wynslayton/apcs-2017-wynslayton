//Wynant Slayton
//Mr Hayes
//9/22/2017
//This program will take any 3 sides or angles of a triangle and return what kind of a triangle it is

import java.util.*;
public class TriangleProg
{
    public TriangleProg()
    {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        String str = new String();
        System.out.println("Would you like to test in angles (A) or side lengths (S)? ");
        str = scan.nextLine();
        System.out.println("Please enter your 3 values");
        System.out.print("Value 1:");
        a = scan.nextDouble();
        System.out.print("\nValue 2:");
        b = scan.nextDouble();
        System.out.print("\nValue 3:");
        c = scan.nextDouble();
        
        if (str == "A"){
            if ((a + b + c) == 180.0){
                System.out.println("It works!");
            }
            else{System.out.println("It doesn't work, you're bad");}
        }
        else{
            if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)){
                System.out.println("It works!");
            }
            else{System.out.println("It doesn't work, you're bad");}
        }
        
        
    }//end of main
}//end of class
