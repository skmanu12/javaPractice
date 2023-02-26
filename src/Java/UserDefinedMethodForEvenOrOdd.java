package Java;

import java.util.Scanner;

public class UserDefinedMethodForEvenOrOdd {
	public static void findEventOdd(int num) {
		if(num%2==0) {
			System.out.println("Its Even");
		}else {
			System.out.println("Its Odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to identify the even or odd");
		int n=s.nextInt();
		
		findEventOdd(n);
	}

}
