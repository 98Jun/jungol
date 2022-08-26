package JO1314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		int arr[][] = new int[num][num];
		int c1 = 65;

		for (int i = 0; i < num; i++) { // 배열에 입력 
			if (i % 2 == 0) {
				for (int j = 0; j < num; j++) {
					arr[j][i] = c1++;
					if (c1 > 90) {
						c1 = 65;
					}
				}
			} else {
				for (int j = num - 1; j >= 0; j--) {
					arr[j][i] = c1++;
					if (c1 > 90) {
						c1 = 65;
					}
				}
			}
		}

		for (int i = 0; i < num; i++) { // 출력 
			for (int j = 0; j < num; j++) {
				System.out.print((char) arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}