package StringPractice;

import java.util.stream.IntStream;

public class CountTotalNumberofCharcterswithutspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Java is Programing language";
System.out.println("Chactor count:"+str.length());
int count = 0;
for(int i=0;i<str.length();i++) {
	if(str.charAt(i)!=' ') {
		count++;
		
	}
}
System.out.println("Without space:"+count);

	}

	
}
