package BasicsJava;
/*final*/ class FinalOne{
	void run() {
		System.out.println("Final class");
	}
}
public class FinalClass extends FinalOne {
	
void run() {
	
	System.out.println("Final Class can not extend");
}
void display() {
	super.run();
	run();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass f=new FinalClass();
		f.display();;

	}

}
