package JavaPractice;
class Vehicle1{
	void run() {
		System.out.println("Running Vehicles");
	}
}
class Bike1 extends Vehicle1{
	void run() {
		System.out.println("Bike running");
	}
}
public class overrideing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 b=new Bike1();
		b.run();
	}

}
