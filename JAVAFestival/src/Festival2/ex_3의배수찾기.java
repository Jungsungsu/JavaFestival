package Festival2;

import java.util.Scanner;

public class ex_3�ǹ��ã�� {
	public static void main(String[] arge) {
		
		Scanner sc= new Scanner(System.in);
		int[] num1 = new int[10];
		for (int i=0; i<num1.length;i++) {
			System.out.print((i+1)+"�� ° ���� �Է�>>");
			num1[i]=sc.nextInt();
		}
		System.out.print("3�� ��� : ");
		for (int j=0;j<num1.length;j++) {
			if (num1[j]%3==0) {
				System.out.print(" "+num1[j]);
			}
		}
		
	}

}
