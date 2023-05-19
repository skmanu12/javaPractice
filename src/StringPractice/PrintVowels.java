package StringPractice;

public class PrintVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "haiiqocnd";
		// int vCount=0;
		String c = "";
		for (int i = 0; i < str.length(); i++) {
			// Check character is vowel or not
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' 
					|| str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				c = c + " " + str.charAt(i);

				// System.out.print("Vowels" +str.charAt(i));

				// System.out.println();
				// Display each vowel

			}

		}
		System.out.print(c);
	}

}
