package StringPractice;

public class RemoveSpecialCharacterExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="The#Virus^Is%from*China";
String s = str.replaceAll("[^a-zA-Z0-9]", " ");
System.out.println(s);
	}

}
