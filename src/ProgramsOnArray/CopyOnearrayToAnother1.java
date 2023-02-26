package ProgramsOnArray;

public class CopyOnearrayToAnother1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 2, 4, 8 };
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		
	}

}
