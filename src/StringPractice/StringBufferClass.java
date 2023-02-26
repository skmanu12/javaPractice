package StringPractice;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer s=new StringBuffer("Hello");
System.out.println(s.insert(1, "Java"));
System.out.println(s.replace(1, 3, "Java"));

System.out.println("Delete String: "+s.delete(1, 4));

//Reverse String
StringBuffer s1=new StringBuffer("Hello1 java is programming language");
System.out.println(s1.reverse());

System.out.println(s1.capacity());

//ensureCapacity- increase the current capacity
s1.ensureCapacity(50);
System.out.println(s1.capacity());


StringBuffer s2=new StringBuffer();
System.out.println("Empty StringBuffer capacity:"+s2.capacity());
	}

}
