package JavaStrings;

public class EqualsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="manappa";
String s2="manappa";
String s3=new String("manappa");
String s4="Kalmani";
String s5=new String("manappa");
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println(s2.equals(s3));
System.out.println(s3.equals(s5));

//==
System.out.println("== operator");
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s3==s5);
	}

}
