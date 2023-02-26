package ProgramsOnArray;

public class RevrseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 5 };
		// Reverse Order
		System.out.println("Reverse order array: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
