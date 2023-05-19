package Javapractice3;

public class StaticVariableCanChangedInStaticMethod {
	static int speed=80;
	static void change() {
		speed=100;
		System.out.println(speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		change();
	}

}
