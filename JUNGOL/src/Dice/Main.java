package Dice;

import java.util.Scanner;

public class Main {
   static int ar[];
   static int n, m;

   public static void dice(int p) {
      if (p == m) {
         for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + 1); // 111 넣기
         }
         System.out.println();
         return;
      }
      for (int i = 0; i < n; i++) { // p==m 이 되기 전까지 ar 배열에 1을 넣는다 
         ar[p] = i; 
         dice(p + 1);  // 넣는 값에 재귀로 반복 
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt(); // 면 개수
      m = sc.nextInt(); // 다이스 개수
      sc.close(); 

      ar = new int[m]; //ar 에 개수만큼 넣는다

      dice(0); 
   }
}