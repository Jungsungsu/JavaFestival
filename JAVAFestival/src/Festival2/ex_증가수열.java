package Festival2;

import java.util.Scanner;

public class ex_�������� {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n �Է� : ");
		int n = sc.nextInt();
		int num = 1;
		int a = 0;
		for (int i = 0; i <= n; i++) {
			num += a;
			a++;
			System.out.print(num + " ");
		}
	}
}
