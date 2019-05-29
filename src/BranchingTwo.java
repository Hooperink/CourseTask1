import java.util.Scanner;

public class BranchingTwo {
    public void count() {
        int a, b, c, d;
        Scanner in = new Scanner(System.in);       
        System.out.println("Enter a: ");               
        a = in.nextInt();        
        System.out.println("Enter b: ");               
        b = in.nextInt();      
        System.out.println("Enter c: ");               
        c = in.nextInt();
        System.out.println("Enter d: ");               
        d = in.nextInt();        
        in.close();
        int minAB = a < b ? a : b;
        int minCD = c < d ? c : d;
        System.out.print("Max = " + (minAB > minCD ? minAB : minCD));
    }
}
