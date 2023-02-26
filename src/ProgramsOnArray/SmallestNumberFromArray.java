package ProgramsOnArray;

public class SmallestNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,1,4};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.print(min);

	}

}
