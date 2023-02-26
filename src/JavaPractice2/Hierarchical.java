package JavaPractice2;
class Animal{
	void eat() {
		System.out.println("Eating.........");
	}
}
class Dog1 extends Animal{
	void dogBark() {
		System.out.println("Barking");
	}
}
class Cat extends Animal{
	void Meow() {
		System.out.println("Meow");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.Meow();
		c.eat();
	}

}
