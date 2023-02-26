package StringPractice;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Manappa";
		String str2 = "Kalmani";
		System.out.println("Before swap: " + str1 + " " + str2);
		str1 = str1 + str2;
//ManappaKalmani
		str2 = str1.substring(0, str1.length() - str2.length());
		System.out.println(str2);
		str1 = str1.substring(str2.length());
		System.out.println(str1);

		System.out.println("After swap:" + str1 + " " + str2);

	}

}
