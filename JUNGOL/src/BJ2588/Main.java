package BJ2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		String num2 = s.next();
		s.close();
		for (int i = num2.length(); i > 0; i--) {
			int n2 = Integer.valueOf(num2.substring(i - 1, i));
			System.out.println(num1 * n2);
		}
		int num3 = Integer.valueOf(num2);
		System.out.println(num1 * num3);
	}

}
