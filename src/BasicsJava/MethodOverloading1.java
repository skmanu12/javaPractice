package BasicsJava;

public class MethodOverloading1 {
public static int add(int a,int b) {
	System.out.println(a+b);
	return a+b;
}
public static int add(int a,int b,int c) {
	System.out.println(a+b+c);
	return a+b+c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading1 m=new MethodOverloading1();
		m.add(10, 11);
		m.add(10, 20, 30);
		System.out.println(MethodOverloading1.add(11, 10));
		System.out.println(MethodOverloading1.add(11, 10,30));
	}

}
