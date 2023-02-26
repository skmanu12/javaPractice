package Basic1;
class Preson{
	int id;
	String name;
	Preson(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Emp extends Preson{
	float salary;
	Emp(int id,String name,float salary){
		super(id,name);
		
		this.salary=salary;
	}
	void display() {
		System.out.println(id+"-"+name+"-"+salary);
	}
	
	
}

public class ConstructorChainingSuperKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp(11, "Manappa",230000);
e.display();
	}

}
