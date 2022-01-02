package Festival3;

public class ex_10진수변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "01001101";
		int sum =0 ;
		String[] strs = new String[str.length()];
		
		for(int i = 0;i<str.length();i++) {
			strs[i] = str.substring(i,i+1);
			if (strs[i].equals("1")) {
				sum += Math.pow(2, str.length()-1-i);
			}
		}
System.out.println(str + "(2) = "+sum+"(10)");
	}

}
