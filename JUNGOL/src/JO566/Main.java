package JO566;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 100;
		int num = s.nextInt();
		int temp = count-num;
		s.close();
		System.out.println(count);
		System.out.println(num);
		System.out.println(temp);
		count=num;// 100 =62
		while (true) {
			
			num=count-temp;//62=62-38
			System.out.println(num);

			if (num < 0) {
				{
					break;
				}
			}

		}
	}
}
