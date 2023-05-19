package ProgramsOnArray;

public class duplicatesInArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] str=new String[] {"one","two","three","two","four","four"};
	for(int i=0;i<str.length;i++) {
		int count = 1;
		for(int j=i+1;j<str.length;j++) {
			if(str[i].equals(str[j])) {
				count++;
			}
		}
		if(count>1) {
			System.out.println(str[i]+":"+count);
		}
	}
	}

}
