package JO1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		s.close();
		int arr[][] = new int[100][100];
		int i, j;
		int num = 1;
		for (i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (j = 0; j < m; j++) {
					arr[i][j] = num++; // 배열에 수를 넣고 1증가시킨다.
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (j = m - 1; j >= 0; j--) { // 뒤에서 부터 첫 번째 열까지 반복
					arr[i][j] = num++; // 배열에 수를 넣고 1증가시킨다.
				}
				for (j = 0; j < m; j++) {
					System.out.print(arr[i][j] + " ");
				}

			}
			System.out.println();
		}
	}
}
