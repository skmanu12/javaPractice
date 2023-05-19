package Javapractice3;

public class WithUsingThisKeyword2 {
	/*
	 * The this keyword can be used to refer current class instance variable. 
	 * If there is ambiguity between the instance variables and parameters, 
	 * this keyword resolves the problem of ambiguity.
	 */
int id;
String name;
float age;
WithUsingThisKeyword2(int id,String name,float age){
	this.id=id;
	this.name=name;
	this.age=age;
}
void display() {
	System.out.println(id+" "+name+" "+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithUsingThisKeyword2 w=new WithUsingThisKeyword2(11,"Mahesh",35);
		w.display();
		
	}

}
