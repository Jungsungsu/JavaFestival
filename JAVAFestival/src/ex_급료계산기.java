import java.util.Scanner;

public class ex_급료계산기 {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int time =sc.nextInt();
		int money = 0;
		if (time>8) {
			money = 40000+(7500*(time-8));
		}else{
			money = time*5000;
		}
		System.out.println("총 임금은 "+money+"원 입니다.");
	}
}
