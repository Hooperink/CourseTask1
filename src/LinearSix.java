import java.util.Scanner;

public class LinearSix {
    public void count() {
        int x, y;
        System.out.println("Enter x: ");
        Scanner in = new Scanner(System.in);        
        x = in.nextInt();   
        System.out.println("Enter y: ");             
        y = in.nextInt();   
        in.close();
        if ((y > 0 && y <= 4 && x <= 2 && x >=-2) || (y == 0 || y < 0 && x <= 4 && x >=-4 ))          
            System.out.println("True");
        else 
            System.out.println("False");  
    }
}