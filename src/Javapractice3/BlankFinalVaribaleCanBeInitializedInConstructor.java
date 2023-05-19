package Javapractice3;

public class BlankFinalVaribaleCanBeInitializedInConstructor {
	/*
	 * Que) Can we initialize blank final variable?
Yes, but only in constructor. For example:
	 */
final int speedLimit;
BlankFinalVaribaleCanBeInitializedInConstructor(){
	speedLimit=90;
	System.out.println(speedLimit);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new BlankFinalVaribaleCanBeInitializedInConstructor();
	}

}
