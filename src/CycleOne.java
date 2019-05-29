import java.util.Scanner;

public class CycleOne {
    public void count() {
        int a, sum = 0;
        System.out.println("Enter positive number: ");
        Scanner in = new Scanner(System.in);        
        a = in.nextInt();
        while (a < 0) {
            System.out.println("Enter positive number: ");
            a = in.nextInt();
        }
        in.close();
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.print("Sum = " + sum);
    }
}