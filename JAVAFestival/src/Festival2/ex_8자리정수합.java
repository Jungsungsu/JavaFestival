package Festival2;

import java.util.Scanner;

public class ex_8�ڸ������� {
  public static void main (String[] arge) {
	  Scanner sc= new Scanner(System.in);
	  System.out.print("���� �Է� : ");
	  String num=sc.next();
	  int result = 0;
	 for (int i=0;i<num.length();i++) {
		 char temp = num.charAt(i);
		 result += (temp-'0');
	 }
	  System.out.print("���� "+result+"�Դϴ�.");
  }
}
