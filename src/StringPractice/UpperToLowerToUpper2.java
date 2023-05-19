package StringPractice;

public class UpperToLowerToUpper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Great Place";

	for(int i=0;i<str.length();i++) {
		if(Character.isLowerCase(str.charAt(i))) {
			System.out.print(Character.toUpperCase(str.charAt(i)));
		}else if(Character.isUpperCase(str.charAt(i))) {
			System.out.print(Character.toLowerCase(str.charAt(i)));
		}
	}
	}

}
