package JO171;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new  Scanner(System.in);
		int num= s.nextInt();
		s.close();
		int n1 =0;
		for(int i=0; i<=num;i++) {
			n1 = n1+i;
		}
		System.out.println(n1);
	}

}
