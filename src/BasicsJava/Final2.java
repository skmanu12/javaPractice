package BasicsJava;
class Bike{
	/*final void run() {
		System.out.println("Bike is running");
	}*/
}
class Honda extends Bike{
	void run() {
		System.out.println("Honda is running");
	}
}
public class Final2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Honda h=new Honda();
h.run();
	}

}
