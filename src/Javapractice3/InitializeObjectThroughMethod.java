package Javapractice3;

public class InitializeObjectThroughMethod {
	int id;
	String name;

	void insertRecord(int i, String n) {
		id = i;
		name = n;
	}

	public void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializeObjectThroughMethod a = new InitializeObjectThroughMethod();
		a.insertRecord(11, "Manappa");
		a.display();
	}

}
