package Festival3;

public class ex_2�����迭90��ȸ�� {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int cnt = 1;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = cnt++;
			}
		}
		System.out.println("����");
		arrprint(arr);
		arr = rotate(arr);
		System.out.println("90�� ȸ��");
		arrprint(arr);
		//https://velog.io/@domybest/2%EC%B0%A8%EC%9B%90-%EB%B0%B0%EC%97%B4-%ED%9A%8C%EC%A0%84%EC%8B%9C%ED%82%A4%EA%B8%B0
		
	}

	private static void arrprint(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if (arr[row][col] >= 10) {
					System.out.print(arr[row][col] + " ");
				} else {
					System.out.print(" " + arr[row][col] + " ");
				}

			}
			System.out.println("");
		}
		
	}
	private static int[][] rotate(int[][] m) {
		int N = m.length;
		int M = m[0].length;
		// ���� ũ�⸸ŭ���� �������ش�.
		int[][] copyMap = new int[M][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				copyMap[N - 1 - j][i] = m[i][j];
			}
		}

		// ���� ���� �迭�� ��ȯ���ش�.
		return copyMap;
	}

}
