package Festival3;

import java.util.Random;
import java.util.Scanner;

public class ex_더하기게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int err=0;
		int a,b,c,d;
		do {
		a=rd.nextInt(8)+1;
		b=rd.nextInt(8)+1;
		c=a+b;
		System.out.print(a+" + "+b+" = ");
		d = sc.nextInt();
		if (c==d) {
			System.out.println("SUCCESS!");
		}else {
			System.out.println("Fail...");
			err++;
		}
		}while(err<=5);
		System.out.println("GAME OVER!");
	}

}
