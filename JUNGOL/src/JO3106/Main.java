package JO3106;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		int num1 = 0;
		int b = 0;
		try {
			while (true) {
				int a = sc.nextInt();
				if (a == 0) {
					break;
				}
				String s = sc.next();
				b = sc.nextInt();
				num1 = Integer.parseInt((s), a);
				System.out.println(Integer.toString((num1), b).toUpperCase());
			}
		} catch (Exception e) {
		}
		sc.close();
	}

}
