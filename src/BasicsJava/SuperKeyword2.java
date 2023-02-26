package BasicsJava;
class Person{
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Emp extends Person{
	float salary;
	Emp(int id, String name,float salary) {
		super(id, name);
		// TODO Auto-generated constructor stub
		this.salary=salary;
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}

	
	
	
}
public class SuperKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp(1,"Manappa",40000);
		e.display();
	}

}
