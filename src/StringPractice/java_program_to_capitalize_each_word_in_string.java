package StringPractice;

public class java_program_to_capitalize_each_word_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str="manappa is kalmani".split("\\s");
		String capitals="";
		for(String s:str) {
			String first = s.substring(0, 1);
			String aftterFirst = s.substring(1);
			capitals+=first.toUpperCase()+aftterFirst+" ";;
		}
		System.out.println(capitals);

	}

}
