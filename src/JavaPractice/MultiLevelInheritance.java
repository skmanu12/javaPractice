package JavaPractice;

class BigAnimal {
	void eat() {
		System.out.println("Eating...............");
	}
}

class Dog2 extends BigAnimal {
	void bark() {
		System.out.println("Dog is barking..");
	}
}

class BabyDog extends Dog2 {
	void run() {
		System.out.println("Baby dog is running....");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog b = new BabyDog();
		b.bark();
		b.eat();
		b.run();
	}

}
