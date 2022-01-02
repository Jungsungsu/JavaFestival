package Festival3;

public class ex_제곱메소드 {

	public static void main(String[] args) {
		int base = 10;
		int n =2;
		int result = powerN(base,n);
		System.out.println("결과확인 : "+result);

	}

	private static int powerN(int base, int n) {
		int j=base;
		for (int i=1;i<n;i++) {
			j*=base;
		}
		return j;
	}

}
