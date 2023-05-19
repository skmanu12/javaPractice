package ProgramsOnArray;

public class AscendingArrayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 8, 2, 3, 1 };
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
