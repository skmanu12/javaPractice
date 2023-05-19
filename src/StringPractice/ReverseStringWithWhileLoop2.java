package StringPractice;

public class ReverseStringWithWhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java is oops programing";
	int i = str1.length();
	String s="";
	while(i>0) {
		 s+= str1.charAt(i-1);
		i--;
	}
	System.out.println(s);
	}

}
