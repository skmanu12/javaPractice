package StringPractice;

public class RotationofAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcde", str2 = "teabcuj";    
        
		if(str1.length()!=str2.length()) {
			System.out.println("Second String is not a rotation of first string1");
		}else {
			str1=str1+str2;
			if(str1.indexOf(str2)!=-1) {
				System.out.println("Second string is a rotation of first string");
			}else {
				System.out.println("Second string is not a rotaion of first string");
			}
		}
		
		
	}
}
