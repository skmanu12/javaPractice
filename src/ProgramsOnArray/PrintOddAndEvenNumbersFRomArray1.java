package ProgramsOnArray;

public class PrintOddAndEvenNumbersFRomArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 1, 4, 6, 2 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i]);
			}

		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i]);
			}

		}
	}

}
