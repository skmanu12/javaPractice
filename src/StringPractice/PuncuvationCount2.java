package StringPractice;

public class PuncuvationCount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "He said, 'The mailman loves you.' I heard it with my ? own ears.";
		int count = 0;
String c="";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == '"' || str.charAt(i) == ';'
					|| str.charAt(i) == ':' || str.charAt(i) == '?'||str.charAt(i)=='\''||str.charAt(i)=='!'||str.charAt(i)=='*') {
				count++;
				c+=str.charAt(i);

			}
		}
		System.out.println(count);
		System.out.println(c);
	}

}
