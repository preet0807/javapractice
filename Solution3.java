// import java.io.*;
// import java.util.*;

// public class Solution3 {

//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         String A=sc.next();
//         String rev="";
//         for(int i=A.length();i>=0;i--){
//            String r= A.substring(i);
//            rev=rev+r;


//         }
//         System.out.println(rev);
    
       
       
        
//     }
// }


import java.io.*;
import java.util.*;

public class Solution3{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int i;
        int count=0;
        for(i=0;i<A.length()/2;i++){
            if(A.charAt(i)==A.charAt(A.length()-1)-i){                
                count ++;
            }
            }
            if(count==A.length()/2)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }


