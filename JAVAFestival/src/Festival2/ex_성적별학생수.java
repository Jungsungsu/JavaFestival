package Festival2;

public class ex_성적별학생수 {
	public static void main (String[] arge) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] cut = score.split(",");
		int a[] = new int[5];
		for (int i =0;i<cut.length;i++) {
			switch(cut[i]) {
			case "A" :
				a[0]++;break;
			case "B" :
				a[1]++;break;
			case "C" :
				a[2]++;break;
			case "D" :
				a[3]++;break;
			case "F" :
				a[4]++;break;
			}
		}
		System.out.println("A : "+a[0]+"명");
		System.out.println("B : "+a[1]+"명");
		System.out.println("C : "+a[2]+"명");
		System.out.println("D : "+a[3]+"명");
		System.out.println("F : "+a[4]+"명");
				
	}

}
