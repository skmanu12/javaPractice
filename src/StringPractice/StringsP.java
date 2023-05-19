package StringPractice;

public class StringsP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="java";
String s2="java";
String s3=new String("manappa");
String s4=new String("kalmani");
String s5=new String("kalmani");
String s6=new String("java");
/*System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);*/
System.out.println(s1.equals(s2));//true
System.out.println(s1==s2);//true
System.out.println(s4==s5);//false, compring refers varibale not values
System.out.println(s4.equals(s5));//true, comparing with value not reference variable
System.out.println(s2.equals(s6));//true, bcz compares with values
System.out.println(s2==s6);//false bcz compares referse variables not content.
	}

}
