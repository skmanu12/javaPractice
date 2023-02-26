package BasicsJava;
class Vehicle{
	void run(){
		System.out.println("Hevicle running");
	}
}
public class MethodOverriding1 extends Vehicle {
	void run(){
		System.out.println("Bike is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding1 m=new MethodOverriding1();
		m.run();

	}

}
