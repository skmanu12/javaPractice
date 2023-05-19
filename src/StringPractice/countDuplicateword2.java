package StringPractice;

import java.util.Arrays;

public class countDuplicateword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Java programing is java the programing The is java mava".toLowerCase();
	String[] words = str.split(" ");
	for(int i=0;i<words.length;i++) {
		int count=1;
		for(int j=i+1;j<words.length;j++) {
			if(words[i].equals(words[j])) {
				count++;
			}
		}
		if(count>1) {
			System.out.println(words[i]+":"+count);
		}
	}
		
	}
}
