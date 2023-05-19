package StringPractice;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "santosh";
		String c = "";
		for (int i = str.length() - 1; i > 0; i--) {
			c += str.charAt(i);
		}
		System.out.println(c);
	}

}
