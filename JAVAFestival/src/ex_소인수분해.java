import java.util.Scanner;

public class ex_소인수분해 {
	public static void main(String[] arge) {
		Scanner sc= new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. : ");
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
