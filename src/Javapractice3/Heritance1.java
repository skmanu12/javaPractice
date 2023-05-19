package Javapractice3;
class Animal2{
	public void eat() {
		System.out.println("Eating......");
	}
}
class Dog2 extends Animal2{
	public void bark() {
		System.out.println("Dog is barking......");
	}
}
public class Heritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog2 d=new Dog2();
d.eat();
d.bark();

	}

}
