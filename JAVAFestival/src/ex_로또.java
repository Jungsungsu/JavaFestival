import java.util.Random;

public class ex_로또 {
	public static void main(String[] arge) {
		Random rd = new Random();
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			int err = 0;
			arr[i] = rd.nextInt(7);
			do {
				err = 0;
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						err = 1;
						arr[i] = rd.nextInt(7);
					}
				}

				} while (err == 1);
			System.out.println("행운의 숫자 : " + arr[i]);
		}
	}

}
