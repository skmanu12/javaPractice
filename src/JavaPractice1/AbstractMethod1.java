package JavaPractice1;
abstract class Bike1{
	abstract void run();
}
class Honda1 extends Bike1{
	void run() {
		System.out.println("Bike riding");
	}
}
public class AbstractMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Honda1 h=new Honda1();
h.run();
	}

}
