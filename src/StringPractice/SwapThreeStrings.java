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
		String temp="";
		str1=str1+str2+str3;
		//ManappaKalmaniBlre
		str3=str1.substring(0,str1.length()-(str2.length()+str3.length()));
		System.out.println(str3);
		//str3='Manappa';
		str2=str1.substring(str3.length()+str2.length());
		System.out.println(str2);
		//str2=Blre
		temp=str1.substring(str3.length());
		//temp=KalmaniBlre
		
		System.out.println(str1);
		//str1=Kalmani
		
	
	
		
		
		
		

	}

}
