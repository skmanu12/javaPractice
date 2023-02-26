package ProgramsOnArray;

public class duplicatesInArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] str=new String[] {"two","three","two","four","five","six","eight","four"};
	for(int i=0;i<str.length;i++) {
		for(int j=i+1;j<str.length;j++) {
			if(str[i].equals(str[j])) {
				System.out.println(str[j]);
			}
		}
	}
	}

}
