package JavaPractice;

public class ConstructorChaining1 {
	ConstructorChaining1() {
		System.out.println("Its a Chaining constructor");
	}

	ConstructorChaining1(int a) {
		this();
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining1 c = new ConstructorChaining1(10);
	}

}
