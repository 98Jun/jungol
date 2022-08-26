package JO545;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num []= new int[10];
		
		int sam= 0;
		int o = 0;
		for(int i=0;i<num.length;i++) {
			num[i]= s.nextInt();
			
			if(num[i]%3==0) {
				sam++;
			}
			if(num[i]%5==0) {
				o++;
			}
		}
		s.close();
		System.out.println("Multiples of 3 : "+sam);
		System.out.println("Multiples of 5 : "+o);
		
	}

}
