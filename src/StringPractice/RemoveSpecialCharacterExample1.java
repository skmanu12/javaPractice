package StringPractice;

public class RemoveSpecialCharacterExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="The#Virus^Is%from*China";
System.out.println(str.replaceAll("[^a-z0-9A-Z]", " "));

	}

}
