package Festival2;

import java.util.Scanner;

public class ex_증가수열 {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n 입력 : ");
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
