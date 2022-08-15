package backjoon;

import java.util.Scanner;

public class backjoon2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if (b < 45) {
			a = 23;
			b = 60 + (b - 45);
		}
		else {
			b = b - 45;
		}
	}

}
