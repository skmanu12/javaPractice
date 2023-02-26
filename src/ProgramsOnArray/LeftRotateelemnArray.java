package ProgramsOnArray;

public class LeftRotateelemnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 4, 5, 5 };
		// Displays original array
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Rotate the given array by 3 times toward left
		for (int i = 0; i < 3; i++) {
			int j, first;
			// Stores the first element of the array
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				// Shift element of array by one
				arr[j] = arr[j + 1];
				
			}
			// First element of array will be added to the end
			arr[j] = first;
		}
		System.out.println();
		// display after shiftinh
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

}
