package JavaPractice2;
class Student{
	void results() {
		System.out.println("Method prints the student results");
	}
}

public class MethodOverriding1 extends Student {
void results() {
	System.out.println("Subclass results");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Overriding method is used to achieve the runtime polymarphism
		//Overriding method is used to achieve the specific implementation in the subclass.
		
		//Rules for Method Overriding
		//1. The method must have the same name as parent class
		//2. The method must have the same parameters as in the parent class
		//3. Method should be an IS-A relationship
		
		MethodOverriding1 m=new MethodOverriding1();
		m.results();

	}

}
