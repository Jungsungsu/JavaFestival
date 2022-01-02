
import java.util.Scanner;


public class ex_2진수변환기 {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>> ");
		int[] arr = new int [10];
		int i =0;
		int num = sc.nextInt();
		while (num != 1) {
			arr[i++] = num % 2;
			num /=2;
		}
		arr[i] = num;
		
		for (int j=i;j>=0;j--) {
			System.out.print(arr[j] + " ");
		}
	}

}
