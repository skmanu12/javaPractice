package ProgramsOnArray;

public class PrintEvenAndOddNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,2,6,7,0};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]);
			}
		}
		System.out.println();
		System.out.println("Odd Numbers: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(a[i]);
			}
		}
	}

}
