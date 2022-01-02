package Festival3;

public class ex_거리가가장작은숫자 {
	public static void main (String[] arge) {
		int[] point = {92,32,93,9,81,2,68};
		int min = Math.abs(point[0] - point[1]);
		int a = 0;
		int b = 0;
		
		for (int i = 0; i <point.length;i++) {
			for(int j=0; j<point.length;j++) {
				if (i !=j) {
					if(min >Math.abs(point[i] - point[j])) {
						min = Math.abs(point[i]-point[j]);
						a=i+1;
						b=j+1;
					}
				}
			}
		}
		System.out.println("result = ["+a+", "+b+"]");
	}

}
