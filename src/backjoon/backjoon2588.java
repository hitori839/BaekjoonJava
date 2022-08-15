package backjoon;

import java.util.Scanner;

public class backjoon2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int b1, b2, b3;
		a = sc.nextInt();
		b = sc.nextInt();
		b3 = b % 10;
		b2 = (b - b3) % 100;
		b1 = b - b3 - b2;
		System.out.println(a * b3);
		System.out.println(a * b2 / 10);
		System.out.println(a * b1 / 100);
		System.out.println((a * b3) + (a * b2) + (a * b1));
	}

}
