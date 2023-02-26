package StringPractice;

public class SwapThreeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Manappa";
		String str2="Kalmani";
		String str3="Blre";
		//str1=Kalmani;
		//str2=Blre;
		//str3=Manappa;
		str1=str1+str2+str3;
		//ManappaKalmaniBlre
		str3=str1.substring(0,str1.length()-(str2.length()+str3.length()));
		System.out.println(str3);
		str1=str1.substring(str3.length(),(str1.length()+str3.length()));
		System.out.println(str1);
		
		
		

	}

}
