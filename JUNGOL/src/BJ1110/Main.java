package BJ1110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int count = 0;
		int ar[] = new int[2];
		s.close();
		if (num < 10) {
			ar[0] = 0;
			ar[1] = num;
		} else {
			ar[0] = num / 10;
			ar[1] = num % 10;
		}

		while (true) {
			int num1 = ar[0] + ar[1];
			int newarr[] = new int[2];
			newarr[0] = ar[1];
			newarr[1] = num1 % 10;
			ar = newarr;
			String sn = String.valueOf(newarr[0]) + String.valueOf(newarr[1]);

			count++;
			if (Integer.parseInt(sn) == num) {
				System.out.println(count);
				break;
			}

		}

	}

}
