package JO174;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Person p[] = new Person[3];
		Person ps = new Person();

		for (int i = 0; i < p.length; i++) {
			p[i] = new Person(s.nextInt(), s.nextInt(), s.nextInt());
		}
		s.close();
		ps.setSj1(p[0].getSj1() + p[1].getSj1() + p[2].getSj1());
		ps.setSj2(p[0].getSj2() + p[1].getSj2() + p[2].getSj2());
		ps.setSj3(p[0].getSj3() + p[1].getSj3() + p[2].getSj3());
		ps.setSum(ps.getSj1() + ps.getSj2() + ps.getSj3());
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
		ps.print();
	}

}

class Person {
	private int sj1;
	private int sj2;
	private int sj3;
	private int sum;

	public Person() {
	}

	public int getSj1() {
		return sj1;
	}

	public void setSj1(int sj1) {
		this.sj1 = sj1;
	}

	public int getSj2() {
		return sj2;
	}

	public void setSj2(int sj2) {
		this.sj2 = sj2;
	}

	public int getSj3() {
		return sj3;
	}

	public void setSj3(int sj3) {
		this.sj3 = sj3;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public Person(int sj1, int sj2, int sj3) {
		this.sj1 = sj1;
		this.sj2 = sj2;
		this.sj3 = sj3;
		sum = sj1 + sj2 + sj3;
	}

	public void print() {
		System.out.printf("%d %d %d %d\n", sj1, sj2, sj3, sum);
	}
}