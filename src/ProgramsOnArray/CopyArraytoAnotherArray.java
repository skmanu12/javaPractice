package ProgramsOnArray;

public class CopyArraytoAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// Print arr1
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		// Print arr2
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}

	}

}
