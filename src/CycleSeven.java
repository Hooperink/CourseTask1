import java.util.Scanner;

public class CycleSeven {
    public void count() {
        int m, n;   
        boolean flag;
        System.out.println("Enter m:");
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        System.out.println("Enter n:");
        n = in.nextInt();
        in.close();
        for (int i = m; i < n; i++) {    
            System.out.print(i + ": ");      
            flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    System.out.print(j + " ");                  
                }                
            }             
            if (!flag)                
                System.out.print(" None | ");
            else
                System.out.print("| ");
        }   
    }   
}
    
