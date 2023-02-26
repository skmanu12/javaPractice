package Basic1;

public class thisToInvokeMethod {
	int id;
	String name;
	thisToInvokeMethod(){
		System.out.println("Its current class constructor");
	}
	thisToInvokeMethod(int id,String name){
		//invoke current class constructor
		this();
		//Invoke the current class variable
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+"-"+name);
	}
	
	void m() {
		System.out.println("This method to invoke 'M' method");
	}
void n() {
	//this keyword is used to invoke the instance method
	this.m();
	System.out.println("this is method 'N'");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisToInvokeMethod m=new thisToInvokeMethod(11,"name");
		m.n();
		m.display();
	}

}
