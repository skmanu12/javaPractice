package JavaStrings;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Manappa";
String s2="Manappa";
String s3=new String("Manappa");
String s4=new String("Manappa");
System.out.println(s1==s2);//true,bcz both refers to same object
System.out.println(s1==s3);//false,bcz s3 refers to object created in nonpool

	}

}
