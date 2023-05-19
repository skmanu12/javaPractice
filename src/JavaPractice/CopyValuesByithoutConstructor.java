package JavaPractice;

public class CopyValuesByithoutConstructor {
	int id;
	String name;

	CopyValuesByithoutConstructor(int id, String name) {
		this.id = id;
		this.name = name;
	}

	CopyValuesByithoutConstructor() {

	}

	void display() {
		System.out.println(id + "-" + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyValuesByithoutConstructor c1 = new CopyValuesByithoutConstructor(11, "Manappa");
		CopyValuesByithoutConstructor c2 = new CopyValuesByithoutConstructor();
		c2.id = c1.id;
		c2.name = c1.name;

		c1.display();
		c2.display();

	}

}
