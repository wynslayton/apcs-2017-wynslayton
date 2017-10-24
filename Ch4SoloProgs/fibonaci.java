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