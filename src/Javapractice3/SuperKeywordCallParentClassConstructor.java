package Javapractice3;
class SuperKeyConstructor{
	/*
	 * The super keyword can also be used to invoke the parent class constructor. Let's see a simple 
	 */
	SuperKeyConstructor(){
		System.out.println("Parent class Constructor.........");
	}
}
class ChildConstructor extends SuperKeyConstructor{
	
	ChildConstructor(){
		super();
		System.out.println("Child class Constructor.........");
	}
}
public class SuperKeywordCallParentClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildConstructor c=new ChildConstructor();
	}

}
