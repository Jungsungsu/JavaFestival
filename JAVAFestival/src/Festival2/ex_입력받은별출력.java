package Festival2;

import java.util.Scanner;

public class ex_�Է¹�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int[] arr= new int[5];
		
		for (int num=0;num<arr.length;num++) {
			System.out.print(num+"��° ���� �� :");
			arr[num]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+":");
			for (int j=0;j<arr[i];j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
