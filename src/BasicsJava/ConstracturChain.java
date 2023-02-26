package BasicsJava;
class Person321{
	int id;
	String name;
	Person321(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Employee321 extends Person321{
	float salary;
	
	Employee321(int id,String name,float salary){
		super(id, name);
		this.salary=salary;
	}
}
public class ConstracturChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee321 emp1=new Employee321(11, "Manappa", 200000);
		System.out.println(emp1.id+" "+emp1.name+"-"+emp1.salary);
	}

}
