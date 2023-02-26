package StringPractice;

public class REversString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "GeeksForGeeks";

		// convert String to character array
		// by using toCharArray
		char[] arr = input.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);

		}

	}

}
