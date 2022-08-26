package JO577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1= s.nextInt();
		int n2= s.nextInt();
		int num= 0;
		s.close();
		num = n1<n2 ? n1*2:n1/2;
		n2 = n1>n2 ? n2*2:n2/2;
		System.out.println(num+" "+n2);
	}

}
