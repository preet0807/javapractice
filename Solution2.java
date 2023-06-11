import java.util.*;


public class Solution2 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        List<String> list= new ArrayList<>();
        for(int i=0;i<=s.length()-k;i++){
           String a=s.substring(i,i+k);
            list.add(a);

        }
        Collections.sort(list);
        smallest=list.get(0);
        largest= list.get(list.size()-1);
        
    
        
        return smallest + "\n" + largest;
       
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}