//Wynant Slayton
//APCS Period 2
//Mr. Hayes
import java.util.*;
public class fibonaci{
        static void main (String [] args){
            Scanner scan = new Scanner(System.in);
            long t1 = 0, t2 = 1, runs;
            
            System.out.println("Ey, 'ow manee time' you wanna run thi' thang?");
            runs = scan.nextLong();
            
            System.out.println(t1);
            System.out.println(t2);
                for (int x = 0; x < runs; x ++){    
                if (x % 2 == 0){
                        t1 += t2;
                        System.out.println(t1);
                    }
                else{
                    t2 += t1;
                    System.out.println(t2);
                }        
            }
    }
}
/*
 * run 1
 * Ey, 'ow manee time' you wanna run thi' thang?
 * 3
 * 0
 * 1
 * 1
 * 2
 * 3
 * 
 * run 2
 * Ey, 'ow manee time' you wanna run thi' thang?
 * 16
 * 0
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 13
 * 21
 * 34
 * 55
 * 89
 * 144
 * 233
 * 377
 * 610
 * 987
 * 1597
 */