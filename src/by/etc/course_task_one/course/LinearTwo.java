package by.etc.course_task_one.course;

import java.util.Scanner;

public class LinearTwo {
	public void count() {
		double a,b,c,z;
		System.out.println("Enter a: ");
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		System.out.println("Enter b: ");
		b = in.nextDouble();
		System.out.println("Enter c: ");
		c = in.nextDouble();
		in.close();
		z = (b + Math.sqrt(b*b + 4*a*c))/2*a - Math.pow(a, 3) * c + Math.pow (b, -2); 
		System.out.println("Answer: " + z);
	}
}
