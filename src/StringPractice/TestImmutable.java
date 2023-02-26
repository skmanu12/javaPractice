package StringPractice;

public class TestImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Immutable string
		String s = "abc";
		s.concat("cdef");
		System.out.println(s);

		// Using equals() method: Compares values
		String s2 = "Manappa";
		String s3 = "Manappa";

		System.out.println("//Using equals() method: Compares values:" + s2.equals(s3));

		// Using == operator: Compares references not values
		System.out.println(s2 == s3);

		// String Comparison //Using compareTo();
		String s4 = "abc";
		String s5 = "abc";
		String s6 = "abce";
		System.out.println(s4.compareTo(s5));
		System.out.println(s4.compareTo(s6));
		System.out.println(s6.compareTo(s5));
		// String Builder class for concatenation using append().
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("World");
		StringBuilder sb3 = sb1.append(sb2);
		System.out.println(sb3);
		sb3.append("amanappa");
		System.out.println(sb3);
		
		//Sub-string

	}

}
