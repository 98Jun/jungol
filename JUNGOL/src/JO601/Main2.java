package JO601;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String text = s.next();
		s.close();
		String[] t = new String[text.length()];
		for (int i = 0; i < text.length(); i++) {
			t[i] = text.substring(i, i + 1);
		}
		int cont = 0;
		for (int i = 0; i < text.length(); i++) {
			cont = text.length() - 1 - i;
			for (int j = 0; j < text.length(); j++) {
				if (cont == text.length()) {
					cont = 0;
				}
				System.out.print(t[cont]);
				cont++;
			}
			System.out.println();
		}

	}

}
