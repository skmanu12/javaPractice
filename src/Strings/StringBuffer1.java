package Strings;

public class StringBuffer1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Manappa ");
		sb.append("Kalmani");
		System.out.println(sb);
		sb.insert(2, "Java");
		System.out.println(sb);
		sb.replace(1, 4, "Seeta");
		System.out.println(sb);
		sb.delete(1, 7);
		System.out.println(sb);
		System.out.println(sb.reverse());
	}

}
