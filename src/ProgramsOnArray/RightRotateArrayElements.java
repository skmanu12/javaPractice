package ProgramsOnArray;

public class RightRotateArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,4,1};

		for (int i = 0; i < 3; i++) {
			int j, last;
			last = arr[arr.length - 1];
			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
