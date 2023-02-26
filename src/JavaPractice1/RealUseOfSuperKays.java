package JavaPractice1;
class Person{
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class ehh extends Person{
	float salary;
	ehh(int id,String name,float salary) {
		super(id,name);
		this.salary=salary;
	}
	void display() {
		System.out.println(id+"--"+name+"--"+salary);
	}
}
public class RealUseOfSuperKays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ehh d=new ehh(123, "manu", 4565757);
d.display();

	}

}
