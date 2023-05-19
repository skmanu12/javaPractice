package StringPractice;

public class VowelsandConsonantCountFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="This is Java Programing Langauge";
		int vCount=0,cCount=0;
		String str=string.toLowerCase();
		System.out.println(str);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'
					||str.charAt(i)=='u') {
				vCount++;
			}else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
				cCount++;
			}
			
		}
		System.out.println(vCount);
		System.out.println(cCount);

	}

}
