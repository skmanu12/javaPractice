package ProgramsOnArray;

public class PrintlargestNumberfromArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 5, 2, 3, 7 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}

		}
		System.out.print(max);
	}

}
