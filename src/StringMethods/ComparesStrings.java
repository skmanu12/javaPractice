package StringMethods;

public class ComparesStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Sachin";
String s2="Sachin";
String s3=new String("Sachin");
String s4="Tendulkar";
System.out.println(s1.equals(s2));//true,Compares values of the strings
System.out.println(s2.equals(s3));//true
System.out.println(s2.equals(s4));//false

//Compare string with == operator- its compares the based on the reference 
System.out.println(s1==s2); //true it compares the reference
System.out.println(s1==s4);// false bcz it compares reference with instance

//Compares string using compareTo method
System.out.println(s1.compareTo(s2));//0
System.out.println(s1.compareTo(s4));//-1

	}

}
