package JO115;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		Person p1 = new Person(s.nextInt(), s.nextInt());
		Person p2 = new Person(s.nextInt(), s.nextInt());
		s.close();
		if (p1.getT() > p2.getT() && p1.getW() > p2.getW()) {
			System.out.print("1 ");
		} else {
			System.out.print("0 ");
		}
	}
}

class Person {
	private int t;
	private int w;

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public Person(int t, int w) {
		this.t = t;
		this.w = w;
	}

}
