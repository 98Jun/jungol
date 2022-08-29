package JO135;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num1 = s.nextInt();
		int num2 = s.nextInt();
		if (num1 > num2) {
			int t = 0;
			t = num1; // t= num1
			num1 = num2;
			num2 = t;
		}
		s.close();
		int sum = 0;
		int count = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				count++;
			}

		}
		double avg = (double) sum / (double) count;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
	}

}
