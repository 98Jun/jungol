package JO1534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num1 = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		String num3;
		
		switch (num2) {
		case 2:
			num3 = Integer.toBinaryString(num1);
			System.out.println(num3);
			break;
		case 8:
			num3 = Integer.toOctalString(num1);
			System.out.println(num3);
			break;
		case 16:
			num3 = Integer.toHexString(num1);
			System.out.println(num3.toUpperCase());
			break;

		}

	}

}
