package JO198;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Person p1 = new Person(s.nextInt(), s.nextDouble());
		Person p2 = new Person(s.nextInt(), s.nextDouble());
		s.close();
		Person p3 = new Person();
		p3.setH(((p1.getH() + p2.getH()) / 2) + 5);
		p3.setW(((p1.getW() + p2.getW()) / 2) - 4.5);
		System.out.println("height : " + p3.getH() + "cm");
		System.out.printf("weight : %.1fkg", p3.getW());
	}

}

class Person {
	private int h;
	private double w;

	public Person() {

	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public Person(int h, double w) {
		this.h = h;
		this.w = w;
	}
}
