package Java;
class Animal23{
	void eat(){
		System.out.println("Animal eat");
	}
}
class Dog123 extends Animal23{
	void dogEat(){
		System.out.println("Dog eat");
	}
}
class Cat extends Animal23{
	void catEat(){
		System.out.println("Cat eat");
	}
}
public class heiarchyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.eat();
		c.catEat();
	}

}
