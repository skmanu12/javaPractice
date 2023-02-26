package JavaPractice;

public class Overloading1 {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Overloading1.add(11, 22));
		System.out.println(Overloading1.add(11, 22, 33));
		System.out.println(Overloading1.add(11.3, 55.2));
	}

}
