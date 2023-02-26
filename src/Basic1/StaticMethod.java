package Basic1;

public class StaticMethod {
	// Static method is belongst to class
	// need not create the objcet for calling the static method
	// static method can access the static variables
	int id;
	String name;
	static String college = "ITC";

	StaticMethod(int id, String name) {
		this.id = id;
		this.name = name;
	}

	static void change() {
		college = "BDIT";
	}

	void display() {
		System.out.println(id + "-" + name + "-" + college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod.change();
		StaticMethod s = new StaticMethod(11, "Manappa");
		StaticMethod s1 = new StaticMethod(12, "Seeta");
		s.display();
		s1.display();
	}

}
