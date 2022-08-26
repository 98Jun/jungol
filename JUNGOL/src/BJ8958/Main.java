package BJ8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String s1[] = new String[num]; // 자르기전에 넣어둘 곳 
		int count = 1;  // 더하는 값 
		int score =0;
		s.close();
		for (int i = 0; i < num; i++) {
			s1[i] = s.next();
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < s1[i].length(); j++) {
				String cut = s1[i].substring(j, j + 1);
				if (cut.equals("O")) {
					score += count++;
				} else {
					count = 1;
				}
			}
			count = 1;
			System.out.println(score);
			score = 0 ;
		}
	}

}
