package JO544;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		s.close();
		int sum= 0;
		int n = 100-num;
		for(int i=0;i<=n;i++) {
			sum+=num++;
		}
		System.out.println(sum);
	}

}
