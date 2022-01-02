package Festival2;

import java.util.Scanner;

public class ex_8자리정수합 {
  public static void main (String[] arge) {
	  Scanner sc= new Scanner(System.in);
	  System.out.print("정수 입력 : ");
	  String num=sc.next();
	  int result = 0;
	 for (int i=0;i<num.length();i++) {
		 char temp = num.charAt(i);
		 result += (temp-'0');
	 }
	  System.out.print("합은 "+result+"입니다.");
  }
}
