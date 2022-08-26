package JO604;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ar[] = new String[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.next();
		}
		char last = s.next().charAt(0);
		s.close();
		for (int i = 0; i < ar.length; i++) {

			if (ar[i].charAt(ar[i].length() - 1) == last) {
				System.out.println(ar[i].toString());
			}
		}
	}
}
