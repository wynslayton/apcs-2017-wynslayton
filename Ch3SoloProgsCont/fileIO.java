//Wynant Slayton
//APCS Period 2
//Mr. Hayes
import java.util.*;
import java.io.*;
public class fileIO
{
    public static void main (String[] args)throws IOException{
    //takes speech from folder
    Scanner file = new Scanner(new File ("speeches\\taft.txt"));
 
    //initializes variables
    String word;
    int count_p = 0, count_y = 0, count_n = 0, count_words = 0, count_j = 0, count_l = 0, count_m = 0;

    //checks and counts how many times the words were said
    while (file.hasNext())
    {
        word = file.next();
        count_words ++;
        if ((word.toLowerCase()).contains("people")){
            count_p ++;
        }
        if ((word.toLowerCase()).contains("peace")){
            count_y ++;
        }
        if ((word.toLowerCase()).contains("america")){
            count_n ++;
        }
        if ((word.toLowerCase()).contains("freedom")){
            count_j ++;
        }
        if ((word.toLowerCase()).contains("no")){
            count_l ++;
        }
        if ((word.toLowerCase()).contains("yes")){
            count_m ++;
        }
    }//end of while
    System.out.println("The speech has " + count_words + " words");
    System.out.println("People:" + count_p);
    System.out.println("Peace:" + count_y);
    System.out.println("America:" + count_n);
    System.out.println("Freedom:" + count_j);
    System.out.println("No:" + count_l);
    System.out.println("Yes:" + count_m);
    }
}

/* jfk run
 * The speech has 1345 words
 * People:2
 * Peace:5
 * America:7
 * Freedom:4
 * No:33
 * Yes:0
 * 
 * In older speeches America was said almost twice as often and No was said twice as often as well. Yes is
 * rarely said in any speeches. Freedom is said about 5 or so times in most speeches and in older speeches
 * People is said more as well
 * 
 */