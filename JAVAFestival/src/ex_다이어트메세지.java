import java.util.Scanner;

public class ex_다이어트메세지 {
	public static void main (String[] arge) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int now=sc.nextInt();
		System.out.print("목표몸무게 : ");
		int befor = sc.nextInt();
		int time = 0;
		
		while(now>befor) {
			time++;
			System.out.print(time+"주차 감량 몸무게 : ");
			now-=sc.nextInt();
		}
		System.out.println(now + "kg 달성!! 축하합니다!");
	}
	

}
