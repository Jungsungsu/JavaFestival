import java.util.Scanner;

public class ex_공약수공배수 {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println("최대공약수&최소공배수 구하기");
		System.out.print("숫자1입력>>");
		int num1 = sc.nextInt();
		System.out.print("숫자2입력>>");
		int num2 = sc.nextInt();
		int a = num1;
		int b = num2;
		if (num1 < num2) {
			a = num2;
			b = num1;
		}
		System.out.println("최대공약수: " + GCD(a, b));
		System.out.println("최소공배수: " + LCM(a, b));
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
