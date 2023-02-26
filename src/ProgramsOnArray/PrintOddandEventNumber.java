package ProgramsOnArray;

public class PrintOddandEventNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,6,2};
		System.out.println("Odd Number:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]);
				
			}
			
		}
		System.out.println();
		System.out.println("Even Number:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]);
				
			}
			
		}


	}

}
