package JO1291;

import java.util.Scanner;

public class Main {

	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	      int s, e;
	      while (true) {
	         s = sc.nextInt();
	         e = sc.nextInt();

	         if (s < 2 || s > 9 || e < 2 || e > 9) {
	            System.out.println("INPUT ERROR!");
	         } else {
	            break;
	         }
	      }
	      if (s > e) {
	         for (int j = 1; j <= 9; j++) {
	            for (int i = s; i >= e; i--) {
	               System.out.printf("%d * %d = %2d   ", i, j, i * j);
	            }
	            System.out.println();
	         }
	      } else {
	         for (int j = 1; j <= 9; j++) {
	            for (int i = s; i <= e; i++) {
	               System.out.printf("%d * %d = %2d   ", i, j, i * j);
	            }
	            System.out.println();
	         }
	      }

	      sc.close();
	   }
	}