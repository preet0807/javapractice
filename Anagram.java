import java.io.*;
import java.util.*;

public class Anagram{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc= new Scanner( System.in);
        String a= sc.next();
        String b= sc.next();
        String a1s= a.toLowerCase();
        String b1s= b.toLowerCase();

       
        char[] chararray= a1s.toCharArray();
        char[] chararray2= b1s.toCharArray();
        Arrays.sort(chararray);
        Arrays.sort(chararray2);
        //  if(a.length() != b.length()){
        //     System.out.println("Not Anagrams");
        // }
        if (Arrays.equals(chararray,chararray2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        

    }
}
