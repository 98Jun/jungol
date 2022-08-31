package JO173;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Num num = new Num(s.nextInt(), s.nextInt());
		s.close();
		if (num.getNum1() < num.getNum2()) {
			int temp = 0;
			temp = num.getNum1();
			num.setNum1(num.getNum2());
			num.setNum2(temp);
		}
		num.print();
	}

}

class Num {
	private int num1;
	private int num2;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public Num(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

	}

	public void print() {
		int num3 = num1 * num1;
		int num4 = num2 * num2;
		System.out.println(num3 - num4);
	}
}
