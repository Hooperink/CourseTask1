import java.util.Scanner;

public class LinearOne {
	public void count() {
		int a,b,c,z;
		System.out.println("Enter a: ");
		Scanner in = new Scanner(System.in);
        a = in.nextInt();
		System.out.println("Enter b: ");
		b = in.nextInt();
		System.out.println("Enter c: ");
		c = in.nextInt();
		in.close();
		z = ((a-3)*b/2)+c;
		System.out.println("Answer: " + z);
	}
}
