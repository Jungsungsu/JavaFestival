import java.util.Scanner;

public class ex_�޷���� {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ð��� �Է��ϼ��� : ");
		int time =sc.nextInt();
		int money = 0;
		if (time>8) {
			money = 40000+(7500*(time-8));
		}else{
			money = time*5000;
		}
		System.out.println("�� �ӱ��� "+money+"�� �Դϴ�.");
	}
}
