package JavaPractice;

public class ConstructorChaining1 {
	int id;
	String name, course;
	float fees;

	ConstructorChaining1(int id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	ConstructorChaining1(int id, String name, String course, float fees) {
		this(id, name, course);
		this.fees = fees;
	}

	void display() {
		System.out.println(id + "-" + name + "-" + course + "-" + fees);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining1 c1 = new ConstructorChaining1(1, "Manappa", "API");
		ConstructorChaining1 c2 = new ConstructorChaining1(1, "Manappa", "API", 20000);
		c1.display();
		c2.display();
	}

}
