package Festival3;

import java.util.Scanner;

public class ex_����ä�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("====ä���ϱ�====");
		String ck = sc.next();
		int score = 0;
		int j = 0;
		for (int i = 0; i < ck.length(); i++) {
			if (ck.charAt(i) == 'O') {
				j++;
				score += j;
			}
			if (ck.charAt(i) == 'X') {
				j = 0;
			}
		}
		System.out.println(score);

	}

}
