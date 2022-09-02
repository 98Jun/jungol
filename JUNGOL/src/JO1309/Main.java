package JO1309;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		long num = n;
		for (int i = n; i > 0; i--) {
			if (i == 1) {
				System.out.println(i + "!" + " = " + i);
			} else {
				System.out.println(i + "!" + " = " + i + " * " + (i - 1) + "!");
			}
		}
		for (int i = n; i > 1; i--) {
			num *= i - 1;
		}
		System.out.println(num);
	}

}
