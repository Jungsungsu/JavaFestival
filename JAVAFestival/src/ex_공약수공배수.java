import java.util.Scanner;

public class ex_���������� {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ִ�����&�ּҰ���� ���ϱ�");
		System.out.print("����1�Է�>>");
		int num1 = sc.nextInt();
		System.out.print("����2�Է�>>");
		int num2 = sc.nextInt();
		int a = num1;
		int b = num2;
		if (num1 < num2) {
			a = num2;
			b = num1;
		}
		System.out.println("�ִ�����: " + GCD(a, b));
		System.out.println("�ּҰ����: " + LCM(a, b));
	}

	private static int LCM(int a, int b) {
		// TODO Auto-generated method stub
		return (a * b) / GCD(a, b);
	}

	private static int GCD(int a, int b) {
		while (b > 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

}
