package BJ1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		s.close();
		String text2[] = text.split(" ");
		int count = text2.length;

		for (int i = 0; i < text2.length; i++) {
			if (text2[i].equals("")||text2[i].equals(" ")) {
				count--;
			}
		}
		System.out.println(count);
	}

}
