package Festival3;

import java.util.Scanner;

public class ex_오름차순정렬 {
	public static void main(String[] arge) {
		Scanner sc= new Scanner(System.in);
		int[] arr=new int[5];
		for (int i=0;i<arr.length;i++) {
			System.out.print(i+"번째 수 입력 : ");
			arr[i]=sc.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < (arr.length - 1); i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}

			}
		}
		System.out.println("정렬 후");
		for (int r = 0; r < (arr.length); r++) {
			System.out.print(arr[r] + " ");
		}
	}

}
