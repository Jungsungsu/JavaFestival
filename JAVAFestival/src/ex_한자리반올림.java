import java.util.Scanner;

public class ex_���ڸ��ݿø� {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("���� �Է� :");
		int num = sc.nextInt();
		int result = 0;
		if (num%10>=5) {
			result = ((num/10)+1)*10;
		}else {
			result = ((num/10))*10;			
		}
		System.out.println("�ݿø� �� : "+result);

	}

}
