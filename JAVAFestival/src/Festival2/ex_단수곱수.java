package Festival2;

import java.util.Scanner;

public class ex_�ܼ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("�ܼ��Է� :");
		int dan = sc.nextInt();
		System.out.println("��� ������ ��� :");
		int su = sc.nextInt();
		System.out.println(dan+"��");
		for (int i=1; i<=su;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}

	}

}
