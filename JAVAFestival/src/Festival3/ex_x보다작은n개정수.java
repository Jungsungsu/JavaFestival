package Festival3;

import java.util.Scanner;

public class ex_x��������n������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է� >>");
		int N = sc.nextInt();
		System.out.print("X �Է� >>");
		int X = sc.nextInt();
		
		int[] num = new int[N];
		for (int i=0;i<N;i++) {
			System.out.print((i+1)+"��° ���� �Է� >> ");
			num[i] = sc.nextInt();
		}
		System.out.print("��� >> ");
		for (int j=0;j<N;j++) {
			if (num[j]<X) {
				System.out.print(num[j]+" ");
			}
		}

	}

}
