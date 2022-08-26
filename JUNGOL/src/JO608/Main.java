package JO608;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String text = s.next();
		s.close();
		if (text.indexOf("c") != -1) {
			System.out.print("Yes ");
		} else {
			System.out.print("No ");
		}
		if (text.indexOf("ab") != -1) {
			System.out.print("Yes ");
		} else {
			System.out.print("No ");
		}

	}

}
