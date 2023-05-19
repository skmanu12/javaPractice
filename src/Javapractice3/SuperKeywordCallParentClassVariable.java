package Javapractice3;
class SuperKeyVariabe {
	/*
	 * We can use super keyword to access the data member or field of parent class. 
	 * It is used if parent class and child class have same fields.
	 */
	String color="Block";

}
class Child extends SuperKeyVariabe {
	String color="White";
	public void print() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class SuperKeywordCallParentClassVariable {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child s=new Child();
		s.print();
		
	}

}
