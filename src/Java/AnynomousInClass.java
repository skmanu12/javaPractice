package Java;

public class AnynomousInClass {
	int fact = 1;

	void fact(int n) {
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnynomousInClass().fact(5);
	}

}
