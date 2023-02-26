package JavaPractice2;
class Dog{
	void eat() {
		
	}
}
class Babydog extends Dog{
	void bark() {
		System.out.println("Baby do is barking");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babydog b=new Babydog();
		b.bark();
		b.eat();
	}

}
