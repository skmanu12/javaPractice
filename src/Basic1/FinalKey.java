package Basic1;
final class Vehicles{
	final int speedLimit=60;
	void change() {
		//final variable can not change the value of it
		//speedLimit=90;
	}
	final void run() {
		System.out.println("Running");
	}
}
//final class can not be extend
/*class h extends Vehicles{
	//Final method can not override
	void run(){
		System.out.println("Honda is running");
	}
}
*/
public class FinalKey {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
