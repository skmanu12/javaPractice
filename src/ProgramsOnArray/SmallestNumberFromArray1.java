package ProgramsOnArray;

public class SmallestNumberFromArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 2, 4, 1 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

}
