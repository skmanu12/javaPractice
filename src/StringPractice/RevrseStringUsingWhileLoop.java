package StringPractice;

public class RevrseStringUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="manappa";
		int l=str.length();
		while(l>0) {
			System.out.print(str.charAt(l-1));
			l--;
		}
	}

}
