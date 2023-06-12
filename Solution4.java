import java.io.*;
import java.util.*;

public class Solution4{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
      
        StringBuilder reversed = new StringBuilder(A);
        reversed.reverse();
        String res= reversed.toString();
        
        if( res.equals(A)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    
        }
       
   
    }




