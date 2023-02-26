package JavaPractice;
class Vehicle2{
	void run() {
		System.out.println("Vehicle running");
	}
}
class Bike2 extends Vehicle2{
	void run() {
		System.out.println("Bike running");
	}
}
public class RunTimePolyMorpism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 v=new Bike2();
		v.run();
	}

}
