package StringPractice;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,c,arm=0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();//n=153
		c=n;
		//153=(1*1*1)+(5*5*5)+(3*3*3)
		while(n>0) {
			r=n%10;
			arm=(r*r*r)+arm;
			n=n/10;
		}
		if(c==arm) {
			System.out.println("Its arm");
		}else {
			System.out.println("Its not arm");
		}
	}

}
