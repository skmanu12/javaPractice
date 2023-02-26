package Basic1;
class Bike{
	void run() {
		System.out.println("Running");
	}
}
class honda extends Bike{
	void run(){
		System.out.println("Honda is running");
		//super.run();
	}
	void running() {
		run();
		super.run();
	}
}

public class SuperKeyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		honda h=new honda();
		h.running();
	}

}
