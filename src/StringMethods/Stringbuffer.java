package StringMethods;

public class Stringbuffer {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello"); 
				
		System.out.println(sb.append("Java"));
		System.out.println("Insert string:"+sb.insert(1, "My"));
		System.out.println("replace string:"+sb.replace(0, 4, "My"));
		System.out.println("replace string:"+sb.delete(0, 2));
		
		System.out.println(sb.reverse());

	}

}
