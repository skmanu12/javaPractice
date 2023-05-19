package ProgramsOnArray;

public class PrintEvenAndOddNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,7,5,8,10};
		
for(int i=0;i<a.length;i++) {
	if(a[i]%2==0) {
		System.out.println(a[i]);
	}
	
}
for(int i=0;i<a.length;i++) {
	if(a[i]%2!=0) {
		System.out.println(a[i]);
	}
	}

	}
}
