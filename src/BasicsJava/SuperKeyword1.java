package BasicsJava;
class A1{
	String color="White";
	A1(){
		System.out.println("A1 constructor....");
	}
	void eat() {
		System.out.println("eating....");
	}
}
class B extends A1{
	B(){
		super();
		System.out.println("B constructor....");
	}
	String color="Black";
	void eat() {
		System.out.println("eating bread");
	}
	void display() {
		System.out.println(super.color);
		eat();
		super.eat();
	}
}
public class SuperKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		System.out.println(b.color);
		b.display();

	}

}
