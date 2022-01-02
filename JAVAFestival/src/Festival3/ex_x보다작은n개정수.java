package Festival3;

import java.util.Scanner;

public class ex_x보다작은n개정수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >>");
		int N = sc.nextInt();
		System.out.print("X 입력 >>");
		int X = sc.nextInt();
		
		int[] num = new int[N];
		for (int i=0;i<N;i++) {
			System.out.print((i+1)+"번째 정수 입력 >> ");
			num[i] = sc.nextInt();
		}
		System.out.print("결과 >> ");
		for (int j=0;j<N;j++) {
			if (num[j]<X) {
				System.out.print(num[j]+" ");
			}
		}

	}

}
