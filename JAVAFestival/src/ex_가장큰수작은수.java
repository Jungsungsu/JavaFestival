import java.util.Random;

public class ex_����ū�������� {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[8];
		int max = 0;
		int min = 100;
		System.out.print("�迭�� �ִ� ��� �� :");
		for (int i=0;i<arr.length;i++) {
			arr[i]=rd.nextInt(99);
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		for (int j=0;j<arr.length;j++) {
			if (max<arr[j]) {max=arr[j];}
			if (min>arr[j]) {min=arr[j];}
		}
		
		System.out.println("���� ū �� : "+max);
		System.out.println("���� ���� �� : "+min);

	}

}
