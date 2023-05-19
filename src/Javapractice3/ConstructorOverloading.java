package Javapractice3;

public class ConstructorOverloading {
	/*
	 * Constructor overloading in Java is a technique of having more than 
	 * one constructor with different parameter lists. They are arranged 
	 * in a way that each constructor performs a different task. They are 
	 * differentiated by the compiler by the number of parameters in the list 
	 * and their types.
	 */
	int id;
	String name;
	int age;
	ConstructorOverloading(int i,String n){
		id=i;
		name=n;
	}
	ConstructorOverloading(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
public void display() {
	System.out.println(id+" "+name+" "+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading c1=new ConstructorOverloading(11,"Manappa");
		ConstructorOverloading c2=new ConstructorOverloading(12,"Manappa",33);
		c1.display();
		c2.display();
	}

}
