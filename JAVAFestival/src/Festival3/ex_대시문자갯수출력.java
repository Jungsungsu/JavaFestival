package Festival3;

import java.util.Scanner;

public class ex_��ù��ڰ������ {
	public static void main(String[] arge) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		String num = sc.next();
		int sum = 0;
		for (int i=0;i<num.length();i++) {
			switch (num.charAt(i)-'0') {
			case 0,6,9 :
				sum+=6;break;
			case 1 :
				sum+=2;break;
			case 2,3,5 :
				sum+=5;break;
			case 4 :
				sum+=4;break;
			case 7 :
				sum+=3;break;
			case 8 :
				sum+=7;break;
			}
		}
		System.out.println("���('-')�� �� �� >> "+sum);
	}

}
