package JO186;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String text1 = s.next();
		String text2 = s.next();
		s.close();
		if (text1.length() <= 100 && text2.length() <= 100) {

			if (text1.length() < text2.length()) {
				System.out.println(text2.length());
			} else {
				System.out.println(text1.length());
			}
		}
		
//		int num = text1.length()<text2.length()? text2.length():text1.length();
//		System.out.println(num);
	}

}
