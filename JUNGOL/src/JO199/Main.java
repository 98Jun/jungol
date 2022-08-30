package JO199;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Person p[] = new Person[n];
		for (int i = 0; i < n; i++) {
			p[i] = new Person(s.next(), s.nextInt(), s.nextInt(), s.nextInt());
		}
		s.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (p[j].getSum() < p[j + 1].getSum()) {
					Person temp = new Person();
					temp = p[j];
					p[j] = p[j + 1];
					p[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			p[i].print();
		}
	}

}

class Person {
	private String name;
	private int sj1;
	private int sj2;
	private int sj3;
	private int sum;

	public Person() {

	}

	public Person(String name, int sj1, int sj2, int sj3) {
		this.name = name;
		this.sj1 = sj1;
		this.sj2 = sj2;
		this.sj3 = sj3;
		sum = sj1 + sj2 + sj3;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void print() {
		System.out.println(this.name + " " + this.sj1 + " " + this.sj2 + " " + this.sj3 + " " + this.sum);
	}
}
