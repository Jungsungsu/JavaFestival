import java.util.Scanner;

public class ex_�ళ�����ﰢ�� {
	public static void main(String[] arge) {
		Scanner sc= new Scanner(System.in);
		System.out.print("�� ���� : ");
		int num = sc.nextInt();
		int st=num;
		for (int i=0;i<num;i++) {
			for (int j=st;j>0;j--) {
				System.out.print("*");
				
			}
			System.out.println("");
			st--;
		}
	}

}
