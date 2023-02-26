package Java;
class Employee{
	float salery=40000;
	
}
class Progrommer extends Employee{
	int bonus=2000;
}
public class Inheritence  {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Progrommer p=new Progrommer();
	System.out.println(p.salery);
	System.out.println(p.bonus);
	}

}
