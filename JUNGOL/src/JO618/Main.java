package JO618;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person[] perArr = new Person[5];
		for (int i = 0; i < perArr.length; i++) {
			perArr[i] = new Person(sc.next(), sc.nextInt(), sc.nextDouble());

		}

		sc.close();

		// 이름순으로 정렬
		Arrays.sort(perArr, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());

			}
		});

		System.out.println("name");

		for (Person person : perArr) {
			System.out.println(person.getName() + " " + person.getHeight() + " " + person.getWeight());
		}
		System.out.println();

		// 몸무게 순으로 정렬
		Arrays.sort(perArr);

		System.out.println("weight");
		for (Person person : perArr) {
			System.out.println(person.getName() + " " + person.getHeight() + " " + person.getWeight());
		}

	}

}

class Person implements Comparable<Person> {
	private String name;
	private int height;
	private double weight;

	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	void print() {
		System.out.println(name + " " + height + " " + weight);
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public int compareTo(Person p) {
		if (this.weight < p.weight) {
			return 1;
		} else if (this.weight == p.weight) {
			return 0;
		} else {
			return -1;
		}
	}

}