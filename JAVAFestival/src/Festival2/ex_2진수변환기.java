package Festival2;

import java.util.Scanner;

public class ex_2������ȯ�� {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�>> ");
		int num = sc.nextInt();
		String n = "";
		for(int i=num; i>0; i/=2) {
			n = String.valueOf(i%2) +" "+ n;
		}
		
		System.out.println(n);
	}

}
