
public class ex_1����2���ϱ�3�ݺ� {
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
		System.out.println("\n��� : " + num);
	}
}
