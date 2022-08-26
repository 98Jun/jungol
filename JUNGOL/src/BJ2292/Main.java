package BJ2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		int n = 1; // 겹수
		int c = 2; // 범위

		if (num == 1) {
			System.out.println(1);
		} else {
			while (c <= num) { // 범위가 num보다 커지기 전까지 반복
				c = c + (6 * n); // 다음 범위의 최솟값을 초기화
				n++;
			}
			System.out.println(n);
		}
	}

}
