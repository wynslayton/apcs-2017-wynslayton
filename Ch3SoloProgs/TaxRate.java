//Wynant Slayton
//APCS Period 2
//9/21/2017
//This program will simulate a progressive tax from 1913 and will return the amount of tax that must be paid when and income is inputted

import java.util.*;

public class TaxRate{
    public static void main( String [] args){
        //variable definement
        double initincome, income, totaltax;    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to taxation! What is your yearly income?");
        System.out.print("$");
        initincome = scan.nextDouble();
        income = initincome;
        
        //50000 tax bracket
        if (income <= 50000){
            totaltax = income * 0.01;
        }
        else{
            totaltax = 50000 * 0.01;
            income -= 50000;
            
            //75000 tax bracket    
            if (income <= 25000){
                totaltax += (income * 0.02);
            }
            else{
                totaltax += (25000 * 0.02);
                income -= 25000;
                
                //100000 tax bracket    
                if (income <= 25000){
                totaltax += (income * 0.03);
            }
                else{
                totaltax += (25000 * 0.03);
                income -= 25000;
                
                //250000 tax bracket        
                    if (income <= 150000){
                        totaltax += (income * 0.04);
                    }
                
                    else{
                        totaltax += (150000 * 0.04);
                        income -= 150000;
                    
                        //500000 tax bracket            
                        if (income <= 250000){
                            totaltax += (income * 0.05);
                        }
                    
                        else{
                            totaltax += (250000 * 0.05);
                            income -= 250000;
                        
                            //500000 + tax bracket                
                            if (income > 0){
                                totaltax += income * 0.06;
                            }
                        }}}}}
        
       System.out.println("\nIncome: $" + initincome);
       System.out.println("Tax: $" + totaltax);
    }//End of main
}//End of class