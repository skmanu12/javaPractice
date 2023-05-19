package Javapractice3;

public class ThisKeyword_InvokeCurrentClassConstrutor {
	/*
	 * The this() constructor call can be used to invoke the current class constructor. 
	 * It is used to reuse the constructor. In other words, it is used for constructor 
	 * chaining.
	 */
	int id;
	String name;
	float age;
	ThisKeyword_InvokeCurrentClassConstrutor(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	ThisKeyword_InvokeCurrentClassConstrutor(int id,String name,float age){
		this(id,name);
		this.age=age;
	}
void display() {
	System.out.println(id+" "+name+" "+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword_InvokeCurrentClassConstrutor s=new ThisKeyword_InvokeCurrentClassConstrutor(11,"Manappa",35);
		ThisKeyword_InvokeCurrentClassConstrutor s2=new ThisKeyword_InvokeCurrentClassConstrutor(12,"Jeeva",36);
		s.display();
		s2.display();
	}

}
