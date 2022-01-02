package Festival2;

import java.util.Scanner;

public class ex_2진수변환기 {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>> ");
		int num = sc.nextInt();
		String n = "";
		for(int i=num; i>0; i/=2) {
			n = String.valueOf(i%2) +" "+ n;
		}
		
		System.out.println(n);
	}

}
