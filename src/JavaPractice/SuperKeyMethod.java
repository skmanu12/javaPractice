package JavaPractice;
class Animal2{
	void eat() {
		System.out.println("Eating animal......");
	}
}
class Dog3 extends Animal2{
	void eat() {
		System.out.println("Eating Dog......");
	}
	void bark() {
		System.out.println("Dog is barking...");
	}
	void work() {
		eat();
		bark();
		super.eat();
	}
}
public class SuperKeyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog3 d=new Dog3();
d.work();
	}

}
