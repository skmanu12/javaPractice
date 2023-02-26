package StringPractice;

public class FrquencyofCharactersInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Java Programming is Java is";
		int freq[] = new int[str.length()];
		int i, j;

		// toArray
		char string[] = str.toCharArray();
		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (string[i] == (string[j])) {
					freq[i]++;
					
					//Set string[j] to 0 to avoid printing visited character 
					string[j] = '0';
				}
			}

		}
		//Displays the each character and their corresponding frequency    
        System.out.println("Characters and their corresponding frequencies");   
		for (i = 0; i < freq.length; i++) {
			 if(string[i] != ' ' && string[i] != '0') 
				System.out.println(string[i] + "-" + freq[i]);
			
		}
	}

}
