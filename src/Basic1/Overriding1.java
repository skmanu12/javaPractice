package Basic1;
class Mahantesh{
	void linux() {
		System.out.println("Mahantesh is linux tester");
	}
}
class manappa extends Mahantesh{
	void testing() {
		System.out.println("Manappa is a tester");
	}
	void linux() {
		System.out.println("Manappa is also doing linux testing");
		
	}
}
public class Overriding1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manappa m=new manappa();
		m.linux();
		m.testing();

	}

}
