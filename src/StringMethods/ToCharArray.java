package StringMethods;

public class ToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="My name is khan";
char[] ch=s1.toCharArray();
for(char c:ch) {
	System.out.println(c);
}
for(int i=0;i<ch.length;i++) {
	System.out.println(ch[i]);
}
	}

}
