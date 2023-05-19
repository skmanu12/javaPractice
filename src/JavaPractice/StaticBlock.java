package JavaPractice;

public class StaticBlock {
	//Is used to initialize the static data member.
	//It is executed before the main method at the time of classloading.
	static{
		System.out.println("Static block is executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main method executed");
	}

}
