package ProgramsOnArray;

public class SmallestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 6, 5, 0 }, { 9, 10, 8 } };
		int min = arr[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
					System.out.println(min);
				}

			}

		}
	}

}
