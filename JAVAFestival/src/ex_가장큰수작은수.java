import java.util.Random;

public class ex_가장큰수작은수 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[8];
		int max = 0;
		int min = 100;
		System.out.print("배열에 있는 모든 값 :");
		for (int i=0;i<arr.length;i++) {
			arr[i]=rd.nextInt(99);
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		for (int j=0;j<arr.length;j++) {
			if (max<arr[j]) {max=arr[j];}
			if (min>arr[j]) {min=arr[j];}
		}
		
		System.out.println("가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);

	}

}
