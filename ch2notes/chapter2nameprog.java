//Wynant
//9/6/2017
//period 2
//Takes a name and prints the first and middle initial seperately from the last name

import java.util.*;
import java.text.*;

public class chapter2nameprog
{

public static void main (String[] args)
{
	//Variable Definement
	String name;
	Scanner scan = new Scanner(System.in);

	//Printing First and middle inital together and last name on its own
	System.out.println("Please enter your name a such: First M. Last");
	name = scan.nextLine();
	System.out.println("\n" + name.substring(0,name.indexOf(" ")+3));
	System.out.println(name.substring(name.lastIndexOf(" ")+1));


}//end of main
}//end of class

/*Output 1
Please enter your name a such: First M. Last
Wynant W. Slayton

Wynant W.
Slayton
Press any key to continue . . .

Output 2
Please enter your name a such: First M. Last
Peter T. Parker

Peter T.
Parker
Press any key to continue . . .
*/