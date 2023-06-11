package javapractice;
public class pyramid1 {

        public static void main(String[] args) {
            int rows = 5;
    
            for (int i = 1; i <= rows; i++) {
                int num = i;
                int spaces = rows - i;
    
                for (int j = 1; j <= spaces; j++) {
                    System.out.print("  ");
                }
    
                for (int k = 1; k <= i; k++) {
                    System.out.print(num + " ");
                    num++;
                }
    
                num -= 2;
                for (int l = i - 1; l >= 1; l--) {
                    System.out.print(num + " ");
                    num--;
                }
    
                System.out.println();
            }
        }
    }
    
    

