package JO185;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String text = s.next();
		String text1 = s.next();
		s.close();
		if (text.indexOf(text1) != -1) {
			System.out.println(text.indexOf(text1));
		} else {
			System.out.println("No");
		}

	}

}
