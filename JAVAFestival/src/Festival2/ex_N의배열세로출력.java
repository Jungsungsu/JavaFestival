package Festival2;

import java.util.Scanner;

public class ex_N�ǹ迭������� {
	public static void main (String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� :");
		int N = sc.nextInt();
		int[][] arr= new int[N][N];
		int num =1;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				arr[j][i] = num++;
			}
		}
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
