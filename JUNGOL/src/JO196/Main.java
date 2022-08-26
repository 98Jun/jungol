package JO196;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Person p[] = new Person[3];

		for (int i = 0; i < p.length; i++) {
			p[i] = new Person(s.next(), s.next(), s.next());
		}
		s.close();
		String ps[] = new String[3];
		for (int i = 0; i < p.length; i++) {
			ps[i] = p[i].n;
		}
		Arrays.sort(ps, Collections.reverseOrder());

		for (int i = 0; i < p.length; i++) {
			if (ps[2].equals(p[i].n)) {
				System.out.println("name : " + p[i].n);
				System.out.println("tel : " + p[i].t);
				System.out.println("addr : " + p[i].a);
			}
		}
	}
}

class Person {
	String n;
	String t;
	String a;

	public Person(String n, String t, String a) {
		this.n = n;
		this.t = t;
		this.a = a;
	}

	@Override
	public String toString() {
		return "Person [n=" + n + ", t=" + t + ", a=" + a + "]";
	}

}
