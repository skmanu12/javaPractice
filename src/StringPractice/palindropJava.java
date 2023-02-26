package StringPractice;

public class palindropJava {

	public static void main(String[] args) {
		String str="madam";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		if(rev.contentEquals(str)) {
			System.out.println(rev+" Its palindrom");
		}else {
			System.out.println("Not palindrom");
		}
				

	}

}
