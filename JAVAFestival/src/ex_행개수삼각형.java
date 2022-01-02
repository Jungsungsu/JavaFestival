import java.util.Scanner;

public class ex_행개수삼각형 {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for (int i =0; i<num ; i++) {
			for (int j =0 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
