package JO114;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num1 = s.nextInt();
		int num2 = s.nextInt();
		s.close();
		System.out.println(++num1 + " " + num2--);
		System.out.println(num1 + " " + num2);

	}

}
