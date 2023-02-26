package Basic1;
class A{
	String color="White";
}
class B extends A{
	String color="Black";
	void print() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class SuperKeyInstanceVariable {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.print();

	}

}
