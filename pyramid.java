package javapractice;


public class pyramid {
    public static void main (String args[]){
    //     Scanner sc= new Scanner(System.in);
    //    int n =sc.nextInt();
    int rows =5;
    int count= 0;
    for (int i=1; i<=rows; i++){
        for(int j=1; j<=rows-i; j++){
            System.out.print("  ");
        }
        for (int k =1; k<=i+count;k++){
            if(k<=i)
            System.out.print(k + " ");
            else 
            System.out.print((i+count-k+1)+" ");
    
        }
        count++;
        System.out.println();

    }   

    }}
    
