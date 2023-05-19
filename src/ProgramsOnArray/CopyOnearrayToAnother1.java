package ProgramsOnArray;

public class CopyOnearrayToAnother1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 3, 2, 4, 8 };
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
		
	}

}
