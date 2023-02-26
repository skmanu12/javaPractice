package ProgramsOnArray;

public class PrintTheElementsOfAnArrayPresentOnEvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 5, 6 };
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.print(arr[i]);
		}
	}

}
