package programmes;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
		int num, a = 0, b = 1, c = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of times");
		num = in.nextInt();
		System.out.println("Fibonacci Series of the number is:");
		for (int i = 1; i <= num; i++) {
			c = a + b;
			System.out.println(+c);
			a = b;
			b = c;

		}
	}
}