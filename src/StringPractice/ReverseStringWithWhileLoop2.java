package StringPractice;

public class ReverseStringWithWhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java is oops programing";
		int i = str1.length();
		while (i > 0) {
			str1.charAt(i - 1);
			i--;
			System.out.print(str1.charAt(i));

		}
	}

}
