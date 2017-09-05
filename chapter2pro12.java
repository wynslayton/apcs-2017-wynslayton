//Wynant
//9/1/2017
//period 2
//determines values of coins in a jar

import java.util.*;
import java.text.*;

public class chapter2pro12
{

public static void main (String[] args)
{
	//variable definement
	double qr, dm, nk, pn, total;
	Scanner scan = new Scanner(System.in);
	NumberFormat money = NumberFormat.getCurrencyInstance();

	//User input of coins
	System.out.print("Quarters: ");
	qr = scan.nextDouble();
	scan.nextLine();

	System.out.print("Dimes: ");
	dm = scan.nextDouble();
	scan.nextLine();

	System.out.print("Nickels: ");
	nk = scan.nextDouble();
	scan.nextLine();

	System.out.print("Pennies: ");
	pn = scan.nextDouble();
	scan.nextLine();

	//Total amount of money in the jar as dollars
	total = (qr * 0.25) + (dm * 0.1) + (nk * 0.05) + (pn * 0.01);

	System.out.println("\nYou have a total of " + money.format(total) + " in this jar.");

}//end of main
}//end of class