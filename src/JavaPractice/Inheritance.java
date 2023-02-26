package JavaPractice;

class Ani {
	void eat() {
		System.out.println("eating...........");
	}
}

class Dogi extends Ani {
	void bark() {
		System.out.println("Dog is barking.........");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogi d = new Dogi();
		d.bark();
		d.eat();
	}

}
