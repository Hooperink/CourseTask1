import java.util.Scanner;

public class BranchingFour {
    public void count() {
        int a, b, x, y, z;
        Scanner in = new Scanner(System.in);       
        System.out.println("Enter A: ");               
        a = in.nextInt();        
        System.out.println("Enter B: ");               
        b = in.nextInt();      
        System.out.println("Enter x: ");               
        x = in.nextInt();
        System.out.println("Enter y: ");               
        y = in.nextInt();    
        System.out.println("Enter z: ");               
        z = in.nextInt();                    
        in.close();
        if ((a * b >= x * y) || (a * b >= z * y) || (a * b >= x * z))
            System.out.print("Brick can go through");
        else 
            System.out.print("Brick can`t go through");
    }
}
