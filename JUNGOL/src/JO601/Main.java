package JO601;

import java.util.Scanner;

public class Main {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        int len = str.length();
	        sc.close();
	        int count;
	        char[] c = new char[len];
	 
	        for (int i = 0; i < len; i++) {
	            c[i] = str.charAt(i);
	        }
	 
	        for (int i = 0; i < len; i++) {
	            count = len - 1 - i; //  처음 작동하면 6 
	            for (int j = 0; j < len; j++) {
	                if (count == len) {
	                    count = 0;
	                }
	                System.out.print(c[count]);
	                count++;
	            }
	            System.out.println();
	        }
	    }
	}
