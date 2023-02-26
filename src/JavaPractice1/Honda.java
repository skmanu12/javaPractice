package JavaPractice1;
abstract class Bike01{
	abstract void run() ;
}
public class Honda extends Bike01 {
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Honda is running");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike01 b=new Honda();
		b.run();

	}

	

}
