
public class ex_1빼기2더하기3반복 {
	public static void main(String[] args) {
		int num = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(" -" + i);
				num += i;
			} else {
				System.out.print(" " + i);
				num -= i;
			}
		}
		System.out.println("\n결과 : " + num);
	}
}
