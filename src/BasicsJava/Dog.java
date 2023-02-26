package BasicsJava;
class Animal{
	public void eat() {
		System.out.println("eating");
	}
}
public class Dog extends Animal {
public void bark() {
	System.out.println("Dog is barking");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d=new Dog();
d.eat();
d.bark();
	}

}
