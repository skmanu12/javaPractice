package StringPractice;

public class PrintVowels2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi ur me enemy if you";
		String c = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				 c+=str.charAt(i);
				
				
			}
		}
		System.out.println(c);
	}
}
