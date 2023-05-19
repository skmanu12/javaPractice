package StringPractice;

public class RemoveWhiteSpaceAndNewline2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Manappa sr engg  " + "\n Tester" + "\n Selenium";
String c="";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' '&&str.charAt(i)!='\t') {
			c+=str.charAt(i);
		}
	}
	System.out.println(c);
	}

}
