package Festival2;

public class ex_가운데글자반환 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("powser"));

	}

	private static String getMiddle(String str) {
		int len = str.length()/2;
		String mid;
		if (str.length()%2==0) {
			mid=str.substring(len-1,len+1);
		}else {
			mid=str.substring(len,len+1);
		}
		return mid;
	}

}
