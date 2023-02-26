package StringPractice;

public class RemoveWhiteSpaceAndNewline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = "Manappa sr engg  " + "\n Tester" + "\n Java";

		String noWhietSpace = "";
		for (int i = 0; i < abc.length(); i++) {
			if (abc.charAt(i) != ' ' && abc.charAt(i) != '\t') {
				noWhietSpace = noWhietSpace + abc.charAt(i);
			}
		}
		System.out.print(noWhietSpace);

	}

}
