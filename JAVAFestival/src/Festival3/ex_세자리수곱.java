package Festival3;

import java.util.Scanner;

public class ex_세자리수곱 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		String num2 = sc.next();
		System.out.println(num1*(num2.charAt(2)-'0'));
		System.out.println(num1*(num2.charAt(1)-'0'));
		System.out.println(num1*(num2.charAt(0)-'0'));
		System.out.println(num1*Integer.valueOf(num2));
	}

}
