package JavaPractice1;
class Animal{
	String colour="White";
	void eat() {
		System.out.println("Animal eating");
	}
	Animal(){
		System.out.println("Animal Constructor");
	}
}
class Dog extends Animal{
	String colour="Black";
	void print() {
		System.out.println(colour);
		System.out.println(super.colour);
	}
	void eat() {
		System.out.println("Dog is eating");
	}
	void bark() {
		System.out.println("Dog is barking");
	}

	void display() {
		super.eat();
	}
	Dog(){
		super();
		System.out.println("Dog construtor");
	}
	
}
public class Super1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d=new Dog();
d.print();
d.eat();
d.display();
	}

}
