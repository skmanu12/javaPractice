package StringPractice;

import java.util.Arrays;

public class countDuplicateword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Java programing is java programing The is java";
		String string=str.toLowerCase();
		String[] arr = string.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					count++;
				}
				
			}
			if(count>1) {
				System.out.println(arr[i]+"-"+count);
			}
		}
		
	}
}
