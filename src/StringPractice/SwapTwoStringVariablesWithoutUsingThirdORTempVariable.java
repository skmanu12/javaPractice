package StringPractice;

public class SwapTwoStringVariablesWithoutUsingThirdORTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Good";
		String str2="Morning";
	str1=str1+str2;
	//GoodMonring
	str2=str1.substring(0,str1.length()-str2.length());
	System.out.println(str2);
	
	str1=str1.substring(str2.length());
	System.out.println(str1);
	}

}
