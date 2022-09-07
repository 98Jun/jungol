package BJ1149;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		Home home[] = new Home[n];

		for (int i = 0; i < n; i++) {
			home[i] = new Home(s.nextInt(), s.nextInt(), s.nextInt());
			home[i].sort();
		}
		s.close();

		for (int i = 0, j = 1; i < n; i++, j++) {
			if (i != n - 1) {
				if (home[i].rgb == home[i + 1].rgb) {
					switch (home[j].rgb) {
					case 1:
						if (home[j].b > home[j].g) {
							home[j].min = home[j].g;
							home[j].rgb = 3;
						} else {
							home[j].min = home[j].b;
							home[j].rgb = 2;
						}
						break;
					case 2:
						if (home[j].r > home[j].g) {
							home[j].min = home[j].g;
							home[j].rgb = 3;
						} else {
							home[j].min = home[j].r;
							home[j].rgb = 1;
						}
						break;
					case 3:
						if (home[j].r > home[j].b) {
							home[j].min = home[j].b;
							home[j].rgb = 2;
						} else {
							home[j].min = home[j].r;
							home[j].rgb = 1;
						}

					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			sum += home[i].min;
		}
		System.out.println(sum);
	}

}

class Home {
	int r;
	int b;
	int g;
	int min;
	int rgb;

	public Home(int r, int b, int g) {
		this.r = r;
		this.b = b;
		this.g = g;
	}

	public int sort() {
		if (r < b) {
			min = r;
			rgb = 1;
		} else {
			min = b;
			rgb = 2;
		}
		if (min > g) {
			min = g;
			rgb = 3;
		}

		return min;
	}
}
