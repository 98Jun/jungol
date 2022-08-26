package JO546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int num = s.nextInt();
		double avg = 0;

		for (int i = 0; i < num; i++) {
			int num2 = s.nextInt();
			avg += num2;
		}
		System.out.printf("avg : %.1f\n", (avg / num));
		if (avg / num >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		s.close();
	}

}
