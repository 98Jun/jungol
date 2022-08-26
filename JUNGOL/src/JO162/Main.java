package JO162;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		int num3 = 0;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");
		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			if (num3 >= 10) {
				num3 = num3 % 10;
				System.out.print(num3 + " ");
			} else {
				System.out.print(num3 + " ");
			}

		}

	}

}
