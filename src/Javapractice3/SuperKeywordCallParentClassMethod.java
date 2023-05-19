package Javapractice3;

class SuperKey_Variabe {
	/*
	 * The super keyword can also be used to invoke parent class method. It should
	 * be used if subclass contains the same method as parent class. In other words,
	 * it is used if method is overridden.
	 */
	public void print() {
		System.out.println("Printing...........");
	}
}

class ChildMethod extends SuperKey_Variabe {
	public void print() {
		System.out.println("Child Method Printing .........");
	}

	public void work() {
		super.print();
		print();
	}
}

public class SuperKeywordCallParentClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildMethod c = new ChildMethod();
		c.work();
	}

}
