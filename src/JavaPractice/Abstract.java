package JavaPractice;
abstract class Bike{
	abstract void run();
}
class Honda extends Bike{

	@Override
	void run() {
		System.out.println("Its Honda running");
		
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike h=new Honda();
		h.run();
	}

}
