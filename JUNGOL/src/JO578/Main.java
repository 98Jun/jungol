package JO578;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		s.close();
		int hnum = n1 < n2 ? n2 : n1;
		int lnum = n1 < n2 ? n1 : n2;
		for (int i = lnum; i <= hnum; i++) {
			System.out.println("== " + i + "dan ==");
			for (int j = 1; j <= 9; j++) {
				if ((i * j) < 10) {
					System.out.println(i + " * " + j + " =  " + (i * j));
				} else {
					System.out.println(i + " * " + j + " = " + (i * j));
				}
			}
			System.out.println();
		}
	}

}
