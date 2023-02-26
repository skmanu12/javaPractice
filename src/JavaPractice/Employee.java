package JavaPractice;

public class Employee {
	int id;
	String name;
	Address address;

	Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name + " " + address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address("Shahapur", "Karnataka", "India");
		Employee e = new Employee(111, "Seeta", a);
		e.display();
	}

}
