package JavaPractice2;
class Employee{
	float salary=30000;
}
public class Prohrammer extends Employee {
	int bonus=2000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prohrammer p=new Prohrammer();
		System.out.println(p.salary);
		System.out.println(p.bonus);
	}

}
