package programmes;

import java.util.Scanner;

public class Fibonacci {

	public static  int series(int num) {

		int a = 0, b = 1;
		int c = 0;
		for (int i = 1; i <= num; i++) {
			c = a + b;
			System.out.println(+c);
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		//Fibonacci f = new Fibonacci();
		series(num);

	}
}
