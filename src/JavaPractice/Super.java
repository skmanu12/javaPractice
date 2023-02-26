package JavaPractice;
class Animal{
	String color="White";
	void eat() {
		System.out.println("Animal eating");
	}
	Animal(){
		System.out.println("Animal Constructor");
	}
}

class Dog extends Animal{
	String color="Black";
	Dog(){
		super();
		System.out.println("Dog Constructor");
		
	}
	void eat() {
		System.out.println("Dog eating");
	}
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	void work() {
		super.eat();
		eat();
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.printColor();
		d.work();
	}

}
