package BasicsJava;

class Employee extends Progromer{
int bonus=20000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		System.out.println(e1.salary);
		System.out.println(e1.bonus);
	}

}

class Progromer{
	float salary=40000;
}
