package Javapractice3;
class Animal1{
	void eat() {
		System.out.println("Eating....");
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("Dog is barking....");
	}
}
class BabyDog1 extends Animal1{
	void weep() {
		System.out.println("BabyDog is barking....");
	}
}
public class HierarchiInheritance {
/*
 * When two or more classes inherits a single class, it is known as hierarchical inheritance. 
 * In the example given below, Dog and Cat classes inherits the Animal class, so there is 
 * hierarchical inheritance.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog1 b=new BabyDog1();
		b.eat();
		b.weep();
	}

}
