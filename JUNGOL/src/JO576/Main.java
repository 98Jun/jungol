package JO576;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		String z = s.next();
		int n2 = s.nextInt();
		s.close();
		int num = 0;
		if (z.equals("+")) {
			num = n1 + n2;
			System.out.println(n1 + " " + z + " " + n2 + " = " + num);
		} else if (z.equals("-")) {
			num = n1 - n2;
			System.out.println(n1 + " " + z + " " + n2 + " = " + num);
		} else if (z.equals("*")) {
			num = n1 * n2;
			System.out.println(n1 + " " + z + " " + n2 + " = " + num);
		} else if (z.equals("/")) {
			num = n1 / n2;
			System.out.println(n1 + " " + z + " " + n2 + " = " + num);
		} else {
			num = 0;
			System.out.println(n1 + " " + z + " " + n2 + " = " + num);
		}
	}

}
