//Alex & Wynant
//9/1/2017
//period 2
//This program reads time in hours, min, sec, and displays as total sec

import java.util.*;
import java.text.*;

public class chapter2pro6
{

public static void main (String[] args)
{
	//Variable definement - hours, minutes, seconds, total seconds and a scanner
	int hr, min, sec, tsec;
	Scanner scan = new Scanner(System.in);

	//User input
	System.out.println("What is the time?");
	System.out.print("Hours: ");
	hr = scan.nextInt();
	scan.nextLine();

	System.out.print("Minutes: ");
	min = scan.nextInt();
	scan.nextLine();

	System.out.print("Seconds: ");
	sec = scan.nextInt();
	scan.nextLine();

	//Conversion into seconds given hr, min, sec
	tsec = (hr * 3600) + (min * 60) + sec;


	System.out.println("Your time in seconds is " + tsec + " Seconds");





}//end of main
}//end of class