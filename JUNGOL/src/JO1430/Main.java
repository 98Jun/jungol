package JO1430;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		String num = Integer.toString((a * b * c));
		String ar[] = new String[num.length()];

		// 하나씩 쪼개서 넣기
		for (int i = 0; i < ar.length - 1; i++) {
			ar[i] = num.substring(i, i + 1);
		}

		// 0~9까지 배열
		int arr1[] = new int[10];
		for (int i = 0; i < 10; i++) {
			arr1[i] = i;
		}
		//카운트 배열
		int arr2[] = new int[10];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < arr1.length; i++) {
				if (Integer.parseInt(ar[i])==arr1[j]) {
					arr2[i]+=1;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(arr2[i]);
		}
	}

}
