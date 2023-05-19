package Javapractice3;
class Animal{
	void eat() {
		System.out.println("Eating.......");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog barking.......");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("BabyDog weeping.......");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog b=new BabyDog();
		b.bark();
		b.eat();
		b.bark();
	}

}
