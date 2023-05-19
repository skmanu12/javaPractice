package StringPractice;

import java.util.Scanner;

public class Armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//153=(1*1*1)+(5*5*5)+(3*3*3)
			
		int n=153;
		int c=n;
		int r;
		int arg=0;
		while(n>0) {
			r=n%10;
			arg=(r*r*r)+arg;
			n=n/10;
		}
		if(c==arg) {
			System.out.println("Its armstrang");
		}else {
			System.out.println("Its not an strong");
		}
	
	}

}
