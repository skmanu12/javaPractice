package JavaPractice2;

public class MethodOverloading1 {
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
		System.out.println(MethodOverloading1.add(20, 30));
		System.out.println(MethodOverloading1.add(10, 40, 20));
		System.out.println(MethodOverloading1.add(12.5, 23.5));
	}

}
