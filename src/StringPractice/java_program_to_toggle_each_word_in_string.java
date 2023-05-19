package StringPractice;

public class java_program_to_toggle_each_word_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str="manappa is kalmani".split(" ");
		String cpitals="";
		for(String s:str) {
			String first = s.substring(0,1);
			String afterFirst = s.substring(1);
			cpitals+=first.toLowerCase()+afterFirst.toUpperCase()+" ";
			
		}
System.out.println(cpitals);
	}

}
