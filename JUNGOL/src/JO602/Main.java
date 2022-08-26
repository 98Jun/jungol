package JO602;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String ar[] = new String[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.next();
		}
		s.close();
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.println(ar[i].toString());
		}
	}

}
