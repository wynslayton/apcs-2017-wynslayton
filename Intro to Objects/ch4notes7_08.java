/********************************************************************
// These are the notes for ch 4 used in hayes class
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;

public class ch4notes7_08
{

 //static int sum = 987654;

public static void main (String[] args)
{

    mathy solver = new mathy();

    System.out.println(solver.abs(-5));
    System.out.println(solver.add(3.2,2.5));
    System.out.println(solver.add(1,2));
   // System.out.println(abs(-8.8));
    //System.out.println(add(1,2));
    //System.out.println(add(1,3,5));
    
    
/**/
}// end of main
//allows you to make other methods
/**
    take the absoulute value of the number
    @param int value
    @return absoulute value of number
*/
//public means it can be seen and accessed everywhere, if not defined it is default public
//need static when not making an object
//void makes sure it doesnt return anything
//int x means that an integer must be passed for this function to work
public static int abs (int x)
{
    if (x < 0)
        x = -x;

    return x;

}//end of abs

/**
    take the absoulute value of the number
    @param double value
    @return absoulute value of number
*/
//overloading - can be done to change the data type
public static double abs (double x)
{
    if (x < 0)
        x = -x;
    System.out.print("Hello");
    return x;
    


}//end of abs




//x and y are local variables only, passed by value
public static int add (int x, int y)
{   System.out.println("OH");
    int sum;      //sum x and y are local var
    sum = x+y;
    x=52;
    return sum;


}//end of add

public static int add (int x, int y, int z)
{   System.out.println("BABY");
    int sum;      //sum x,z, and y are local var
    sum = x+y+z;

    return sum;


}//end of add


}// end of class









