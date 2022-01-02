package Festival2;

import java.util.Scanner;

public class ex_3의배수찾기 {
	public static void main(String[] arge) {
		
		Scanner sc= new Scanner(System.in);
		int[] num1 = new int[10];
		for (int i=0; i<num1.length;i++) {
			System.out.print((i+1)+"번 째 정수 입력>>");
			num1[i]=sc.nextInt();
		}
		System.out.print("3의 배수 : ");
		for (int j=0;j<num1.length;j++) {
			if (num1[j]%3==0) {
				System.out.print(" "+num1[j]);
			}
		}
		
	}

}
