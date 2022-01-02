package Festival3;

import java.util.Scanner;

public class ex_알파벳분해기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력>> ");
		String str1 = sc.next();
		String str2 = str1.toLowerCase();
		int[] a = new int[26];
		for (int cnt=0; cnt<str2.length();cnt++) {
			char ch = str2.charAt(cnt);
			a[ch-97]++;
		}
		for (int i=0;i<26;i++) {
			System.out.println((char)(97+i)+":"+a[i]);
		}
	}
}
