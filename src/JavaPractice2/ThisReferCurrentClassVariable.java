package JavaPractice2;

public class ThisReferCurrentClassVariable {
	int id;
	String name;

	ThisReferCurrentClassVariable(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisReferCurrentClassVariable t = new ThisReferCurrentClassVariable(11, "Shree");
		t.display();
	}

}
