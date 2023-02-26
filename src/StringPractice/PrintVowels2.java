package StringPractice;

public class PrintVowels2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="haiiqocndU";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
					||str.charAt(i)=='o'||str.charAt(i)=='u') {
				System.out.print(str.charAt(i));
			}
		}
		}

}
