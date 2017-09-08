//Wynant Slayton
//8/18/2017
//example 1.1
//first program to test output

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

import java.text.*;//only imports what is used in code from this

public class myfirstprogram			//file and class name mustttttt match
{
	//put constants here
	final static double PI = 3.1415;
public static void main (String[] args)	// must have main
{
/**/
	//double num, num2;
	//String name = new String();
	//Scanner keyboard = new Scanner(System.in);
	//DecimalFormat fmt2dec = new DecimalFormat("0.##"); //floats max number of ## marks

	//DecimalFormat fmt2dec = new DecimalFormat("0.00");//0's always pad the output with 0's

	//System.out.print("Enter a Number");
	//num = keyboard.nextDouble();

	//num2 = Math.pow(num,6); //Math is a static class so you don't need to make a new object for each thing or import it


	//Scanner scan = new Scanner(System.in);
	//name = scan.nextLine();
	//scan.nextLine(); //clears input buffer of \n

	//System.out.println(num + " to the power of six equals " + num2);
	//System.out.println(num + " to the power of six equals " + fmt2dec.format(num2));

	//System.out.println("Thank you fo using my program " + name);

	//System.out.println(PI);

	//System.out.println("A quote by Abraham Lincolin:");
	//System.out.println("Whatever you are, be a good one.");

	//System.out.println("I love you Kevin T. Hayes!!!!!!! OoO");

	//System.out.println("hamburger".substring(4, 8));

	//%marks places for var to display
	//System.out.printf("%.1f to the power of 6 = $%,.2f \n", num, num2);

	/*	int x,y;
		x = 2; y = 5; //Equals operator has the lowest precidence

		num = x/y;
		num = 7/22;
		num = 7/22.0; //promotes stuff to a double
		num = x/ (double) y; //Casting (and promotion)
		char a = (char) 97 + 3;


		System.out.println(a);

	*/

/*
	String word = new String("Jimmy Neutron");
	String word1 = word;
	//word1 = "Jimmy Neutron";
	String word2 = new String("Jimmy Neutron");


	//Returns either true of false
	System.out.println(".equals(): " + word.equals(word1));
	System.out.println("== : " +(word == word1));

	//.equals() compares criteria/value; == compares if the objects are the same

	System.out.println(".equals(): " + word.equals(word2));//true because it finds the value of each to be equal CRITERIA
	System.out.println("== : " +(word1 == word2));//Finds whether they are the same object or not OBJECT

	//word is immutable, by redefining word1 that makes a new object, even if their values are equivilent w1 and w are not the same

/**//*

	String name = new String("Alexander M Kashyap");
	String lname = "Hayes", fname = "Kevin", mname;

	fname = "Thomas"; //string is special define like primitive data

	//string methods pg 78
	System.out.println(fname.length() );
	System.out.println(name.replace('a','*' )); //(n,n-1) n to n-1 (n) goes t the end of the string
	System.out.println(name.compareTo(fname)); //compares where I am in realation to you
	System.out.println(name.substring(2,6));


/**/
	int length;
	int x = 9;
	int id =789;
	double num = 5;

	Integer number = new Integer(47);//int is basic data, Integer is a class
	number = id;//autoboxing
	System.out.println(number );

	System.out.println(Integer.MAX_VALUE );
	System.out.println(Integer.parseInt("56") +1 );
	System.out.println("56" + 1);

	//ArrayList<int> grades = new ArrayList<int>();
	ArrayList<Integer> grades = new ArrayList<Integer>();


	/*Systm.out.print("""

	  ______        __                                      __    __                     __                  __    __
	 |      \      |  \                                    |  \  /  \                   |  \                |  \  |  \
	  \$$$$$$      | $$  ______  __     __   ______        | $$ /  $$ ______  __     __  \$$ _______        | $$  | $$  ______   __    __   ______    _______
	   | $$        | $$ /      \|  \   /  \ /      \       | $$/  $$ /      \|  \   /  \|  \|       \       | $$__| $$ |      \ |  \  |  \ /      \  /       \
	   | $$        | $$|  $$$$$$\\$$\ /  $$|  $$$$$$\      | $$  $$ |  $$$$$$\\$$\ /  $$| $$| $$$$$$$\      | $$    $$  \$$$$$$\| $$  | $$|  $$$$$$\|  $$$$$$$
	   | $$        | $$| $$  | $$ \$$\  $$ | $$    $$      | $$$$$\ | $$    $$ \$$\  $$ | $$| $$  | $$      | $$$$$$$$ /      $$| $$  | $$| $$    $$ \$$    \
	  _| $$_       | $$| $$__/ $$  \$$ $$  | $$$$$$$$      | $$ \$$\| $$$$$$$$  \$$ $$  | $$| $$  | $$      | $$  | $$|  $$$$$$$| $$__/ $$| $$$$$$$$ _\$$$$$$\
	 |   $$ \      | $$ \$$    $$   \$$$    \$$     \      | $$  \$$\\$$     \   \$$$   | $$| $$  | $$      | $$  | $$ \$$    $$ \$$    $$ \$$     \|       $$
	  \$$$$$$       \$$  \$$$$$$     \$      \$$$$$$$       \$$   \$$ \$$$$$$$    \$     \$$ \$$   \$$       \$$   \$$  \$$$$$$$ _\$$$$$$$  \$$$$$$$ \$$$$$$$
	                                                                                                                            |  \__| $$
	                                                                                                                             \$$    $$
                                                                                                                                  \$$$$$$
		""")*/

/**/
}//end of main
}//end of class myfirstprogram


/*                         xxxx				xxxx
						  xx x xx		   xx x xx
						   xxxx				xxxx

					xxxxx             x           xxxxx
					x  x x             x         x x  x
					 x x  x          xxxx       x  x x
					  xx   x                   x   xx
					   x   xxxxxxxxxxxxxxxxxxxxx   x
					    x  x    x    x    x    x  x
					     xxxxxxxxxxxxxxxxxxxxxxxxx

*/
















