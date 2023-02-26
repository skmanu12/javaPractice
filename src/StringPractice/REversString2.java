package StringPractice;

public class REversString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "GeeksForGeeks";

		// convert String to character array
		// by using toCharArray
		char[] str = input.toCharArray();
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]);
		}

	}

}
