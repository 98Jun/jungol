package JO1035;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0;
		int ar[] = new int[9];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.nextInt();

		}
		s.close();
		int arr[]= ar.clone();
		
		Arrays.sort(arr);
		int max = 0;
		
		for(int i=0; i<ar.length;i++) {
			
			if(arr[8]==ar[i]) {
				max= ar[i];
				num=i+1;
			}
		}
		System.out.println(max);
		System.out.println(num);
	}

}