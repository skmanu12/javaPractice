package JavaPractice;

class King {
	public void eac1() {
		System.out.println("eating............");
	}
}

class monkey extends King {
	public void bark() {
		System.out.println("barking....");

	}
}

class Rabit extends King {
	public void meow() {
		System.out.println("meow......");
	}
}

public class hierachy12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		monkey b = new monkey();
		b.bark();
		b.eac1();

		Rabit c = new Rabit();
		c.meow();
		c.eac1();
	}

}
