package Javapractice3;
class FinalKeyMethod{
	final void run() {
		System.out.println("Running...............");
	}
}
public class FinalMethod extends FinalKeyMethod {
	/*
	 * If you make any method as final, you cannot override it.
	 */
	/* void run() {
		System.out.println("Running...............");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
