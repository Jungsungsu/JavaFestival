package Festival2;

public class ex_�������������Ǻ� {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1,num2);
		System.out.println("��� Ȯ�� : "+result);

	}

	private static boolean isDivide(int num1, int num2) {
		boolean result = false;
		if (num1%num2==0) {
			 result = true;
		}
		return result;
	}

}
