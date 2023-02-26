package JavaPractice1;
abstract class Bik02{
	abstract void run();
}
public class Abstarct1 extends Bik02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstarct1 a=new Abstarct1();
		a.run();
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Method implemented..............");
	}

}
