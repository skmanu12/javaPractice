package ProgramsOnArray;

public class leftrotatearrayelements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 1, 4 };
		System.out.println("Before rotate");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			int j, first;
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
		}
		System.out.println("After rotate");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
