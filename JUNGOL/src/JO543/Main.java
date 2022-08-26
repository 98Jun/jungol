package JO543;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c = 2;
		int num = s.nextInt();
		s.close();
		if (num <= 50) {
			for(int i=0; i<num/2; i++) {
			System.out.print(c+" ");
			c++;
			c++;
			}
		}
	}

}
