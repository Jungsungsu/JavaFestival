import java.util.Scanner;

public class ex_���μ����� {
	public static void main(String[] arge) {
		Scanner sc= new Scanner(System.in);
		System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
		int N = sc.nextInt();
		for(int i = 2; i <= N; i++) {
			while(N % i == 0) {
				System.out.print(i);
				N /= i;
				if (N != 1) {System.out.print("*");}
			}
			
		}

	}
}
