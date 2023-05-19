package StringPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharsUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="manappa";
		//char[] chars = str.toCharArray();
		
		//System.out.println(chars);
		StringBuilder sb=new StringBuilder();
		Set s=new HashSet();
		
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				
				}
			
			}
			if(count>1) {
				
					System.out.println(s+":"+count);
				}
				
			}
		
			
			
			
		}
		
}
	

