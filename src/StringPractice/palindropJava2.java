package StringPractice;

public class palindropJava2 {

	public static void main(String[] args) {
String str="gadag".toLowerCase();
String rev="";
for(int i=str.length()-1;i>=0;i--) {
	rev+=str.charAt(i);
}
System.out.println(rev);
	}

}
