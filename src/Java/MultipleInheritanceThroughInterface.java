package Java;
interface Printable{
	void print();
}
interface Showable{
	void print();
}
class Test implements Printable,Showable{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Prints the values");
	}
	
}
public class MultipleInheritanceThroughInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
