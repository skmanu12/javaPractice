package Strings;
class Person{
	int id;
	String name;
	Person(int i,String n){
		id=i;
		name=n;
	}
}
class Emp extends Person{
	float salary;
Emp(int i, String n,float s) {
	
		super(i, n);
		salary=s;
	}

void diplay() {
	System.out.println(id+" "+name+" "+salary);
}

	
}

public class SuperKeyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp(11, "Manappa", 300000);
		e.diplay();
	}

}
