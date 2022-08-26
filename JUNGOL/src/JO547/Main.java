package JO547;

public class Main {

	public static void main(String[] args) {
		int arr[][]= new int[5][5];
		int num=2;
		for(int i=0;i<5;i++) {
			for(int j=0; j<5;j++) {
				arr[i][j]= num+j;
				System.out.print(arr[i][j]+" ");
			}
			num++;
			System.out.println();
		}
	}

}
