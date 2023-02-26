package JavaPractice1;
class Vehicle{
	final void run() {
		System.out.println("Vehicle running");
	}
}
final class Bike{
	void run() {
		System.out.println("Bike running is car");
	}
}

// final class can not extend
/*class Car extends Bike{
	void run() {
		System.out.println("Bike running is car");
	}
}*/

public class FinalKeys extends Vehicle {
final int speedlimit=90;
void change() {
	//final variable can not change
	//speedlimit=400;
}
// final method can not override
/*void run() {
	System.out.println("Bike Running");
}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeys f=new FinalKeys();
		int i=f.speedlimit;
		System.out.println(i);
		f.change();
		
		
	}

}
