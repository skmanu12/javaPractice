package JavaPractice;

public class ThisKey1 {
	int id;
	String name;

	ThisKey1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	static void change() {
		System.out.println("Change is static method");
	}

	void m() {
		System.out.println("Method M is playing important role");
		change();
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKey1 s1 = new ThisKey1(111, "Manappa");
		ThisKey1 s2 = new ThisKey1(112, "Jeeva");
		s1.m();
		s1.display();
		s2.display();
	}

}
