package JO197;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Box box[] = new Box[2];

		for (int i = 0; i < box.length; i++) {
			box[i] = new Box(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
		}
		s.close();
		Box bigbox = new Box();
		
		
		bigbox.x1 = box[0].x1 < box[1].x1 ? box[0].x1 : box[1].x1;
		bigbox.x2 = box[0].x2 < box[1].x2 ? box[0].x2 : box[1].x2;
		bigbox.y1 = box[0].y1 > box[1].y1 ? box[0].y1 : box[1].y1;
		bigbox.y2 = box[0].y2 > box[1].y2 ? box[0].y2 : box[1].y2;

		System.out.println(bigbox.toString());

	}

}

class Box {
	int x1;
	int x2;
	int y1;

	@Override
	public String toString() {
		return x1 + " " + x2 + " " + y1 + " " + y2;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	int y2;

	public Box() {

	}

	public Box(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

}
