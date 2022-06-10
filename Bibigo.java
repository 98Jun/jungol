package Day0610;

import java.util.Scanner;

public class Bibigo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		int i;
		int sum = 0, sum1 = 0;
		double avg = 0;
		for (i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			if (i  % 2 != 0) {
				sum += arr[i];
			} else
				sum1 += arr[i];
			avg = sum1 / 5.0;
		}

		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
		s.close();
	}

}
