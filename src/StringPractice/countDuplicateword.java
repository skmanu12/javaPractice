package StringPractice;

import java.util.Arrays;

public class countDuplicateword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Java programing is java programing The java";
		String str1 = str.toLowerCase();
		String words[] = str1.split(" ");

		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}

			}
			if (count>1) {
				System.out.println(count+":"+words[i]);
			}
		}
		//System.out.println(Arrays.toString(words));
	}

}
