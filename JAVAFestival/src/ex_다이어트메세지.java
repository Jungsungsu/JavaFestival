import java.util.Scanner;

public class ex_���̾�Ʈ�޼��� {
	public static void main (String[] arge) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("��������� : ");
		int now=sc.nextInt();
		System.out.print("��ǥ������ : ");
		int befor = sc.nextInt();
		int time = 0;
		
		while(now>befor) {
			time++;
			System.out.print(time+"���� ���� ������ : ");
			now-=sc.nextInt();
		}
		System.out.println(now + "kg �޼�!! �����մϴ�!");
	}
	

}
