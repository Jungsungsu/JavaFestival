package Festival3;

import java.util.Scanner;

public class ex_���ڸ����� {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� >> ");
		String num2 = sc.next();
		System.out.println(num1*(num2.charAt(2)-'0'));
		System.out.println(num1*(num2.charAt(1)-'0'));
		System.out.println(num1*(num2.charAt(0)-'0'));
		System.out.println(num1*Integer.valueOf(num2));
	}

}
