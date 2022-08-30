package JO524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num1 = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		boolean b1 = (num1 != 0 && num2 != 0);
		boolean b2 = (num1 != 0 || num2 != 0);

		if (b1 == true) {
			System.out.print("1 ");
		} else {
			System.out.print("0 ");
		}

		if (b2 == true) {
			System.out.print("1 \n");
		} else {
			System.out.print("0 \n");
		}
		System.out.println("[JAVA]");
		if (b1 == true) {
			System.out.print("true ");
		} else {
			System.out.print("false ");
		}
		if (b2 == true) {
			System.out.print("true ");
		} else {
			System.out.print("false ");
		}

	}

}
