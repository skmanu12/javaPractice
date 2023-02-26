package JavaPractice;
class vehicle3{
	final void runVehicle() {
		System.out.println("Run vehicles");
	}
}
class bike3 extends vehicle3{
	/*void runVehicle() {
		System.out.println("Bike running");
	super.runVehicle();
	}*/
	
}
public class FinalKeys {
final int speedLimit=90;
void run() {
	System.out.println(speedLimit);
}
final void run1() {
	System.out.println("Final Methods");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeys f=new FinalKeys();
		f.run();
		bike3 b=new bike3();
		//b.work();
	}

}
