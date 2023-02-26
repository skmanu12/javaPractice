package JavaPractice1;
class Employee{
	float salary=40000;
}
public class Programer extends Employee {
	float bonus=20000;
	public void display() {
		System.out.println(salary+""+bonus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programer p=new Programer();
		p.display();
	}

}

