//Wynant and Alex
//8/28/2017

import java.util.Scanner;
import java.text.*;

public class chapter2pro11
{

public static void main (String[] args)
{
	double od1, od2, g, mpg;

	Scanner scan = new Scanner(System.in);

	System.out.println("Start of trip odometer reading:");
	od1 = scan.nextDouble();
	scan.nextLine();
	System.out.println("End of trip odometer reading:");
	od2 = scan.nextDouble();
	scan.nextLine();
	System.out.println("Gallons used:");
	g = scan.nextDouble();
	scan.nextLine();

	mpg = (od2-od1)/g;

	DecimalFormat richard = new DecimalFormat("0.00");

	System.out.println("Miles per Gallon: " + richard.format(mpg));







}//end of main
}//end of class