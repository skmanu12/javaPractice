package StringPractice;

public class ReverseStringWithWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="Java is oops programing";
int i=str1.length();
String rev="";
while(i>0) {
	rev+=str1.charAt(i-1);
	i--;
}
System.out.print(rev);
	}

}
