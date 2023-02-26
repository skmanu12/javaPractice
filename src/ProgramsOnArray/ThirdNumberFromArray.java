package ProgramsOnArray;

public class ThirdNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 5, 7, 3, 4 };
		// int total=arr.length;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.print(arr[2]);

	}

}
