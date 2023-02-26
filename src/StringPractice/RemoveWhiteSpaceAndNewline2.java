package StringPractice;

public class RemoveWhiteSpaceAndNewline2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String abc="Manappa sr engg  "
		+"\n Tester"
		+"\n Selenium";

for(int i=0;i<abc.length();i++) {
	if(abc.charAt(i)!=' '&&abc.charAt(i)!='\t') {
		System.out.print(abc.charAt(i));
	}
}

	}

}
