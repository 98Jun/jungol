package JO575;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int num = n1;
		s.close();
		if (n2 != 0) {
			for (int i = 1; i < n2; i++) {
				n1 = n1 * num;
			}
		} else {
			n1 = 1;
		}
		System.out.println(n1);

	}

}
