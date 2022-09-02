package JO1309;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();

		// 반복문 해결
//		long num = n;
//		for (int i = n; i > 0; i--) {
//			if (i == 1) {
//				System.out.println(i + "!" + " = " + i);
//			} else {
//				System.out.println(i + "!" + " = " + i + " * " + (i - 1) + "!");
//			}
//		}
//		for (int i = n; i > 1; i--) {
//			num *= i - 1;
//		}
//		System.out.println(num); 
		// 재귀해결
		Num.print(n);
		System.out.println(Num.sum);
	}

}

class Num {
	static long sum;

	public static long print(int n) {
		if (n == 1) {
			System.out.println(n + "!" + " = " + n);
			return 1;
		} else {
			System.out.println(n + "!" + " = " + n + " * " + (n - 1) + "!");
		}
		return sum = n * print(n - 1);
	}
}