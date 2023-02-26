package StringPractice;

import java.util.Scanner;

public class fibanciSeries3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter fibanaci series");
		int n=s.nextInt();
		int n1=0,n2=1,n3,i,count=n;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=0;i<count;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    

	}

}
