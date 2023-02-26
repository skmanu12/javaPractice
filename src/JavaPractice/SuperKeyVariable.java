package JavaPractice;
class Animal1{
	String color="White";
}
class Dog1 extends Animal1{
	String color="Black";
	void printColour() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class SuperKeyVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d=new Dog1();
		d.printColour();
	}

}
