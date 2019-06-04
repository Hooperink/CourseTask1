package task_course_1;

import java.util.Scanner;

public class LinearThree {
	public void count() {
		double a,b,z;
		System.out.println("Enter a: ");
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		System.out.println("Enter b: ");
		b = in.nextDouble();		
		in.close();
		z = (Math.sin(a) + Math.cos(b)) / (Math.cos(a) - Math.sin(b)) * Math.tan(a * b); 
		System.out.println("Answer: " + z);
	}
}
