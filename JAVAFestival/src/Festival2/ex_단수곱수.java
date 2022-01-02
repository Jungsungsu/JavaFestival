package Festival2;

import java.util.Scanner;

public class ex_단수곱수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("단수입력 :");
		int dan = sc.nextInt();
		System.out.println("어느 수까지 출력 :");
		int su = sc.nextInt();
		System.out.println(dan+"단");
		for (int i=1; i<=su;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}

	}

}
