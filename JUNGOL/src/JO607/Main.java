package JO607;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String text1 = s.next();
		String text2 = s.next();
		s.close();
		text1 = text1.substring(0, 2);
		text2 = text1 + text2.substring(2, text2.length()) + text1;
		System.out.println(text2);
	}

}
