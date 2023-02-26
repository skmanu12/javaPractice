package JavaPractice;
class Person{
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Empi extends Person{
	float salary;
	Empi(int id,String name,float salary){
		super(id,name);
		this.salary=salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}
}

public class SuperKeyPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Empi e=new Empi(111, "Manappa", 77000);
e.display();
	}

}
