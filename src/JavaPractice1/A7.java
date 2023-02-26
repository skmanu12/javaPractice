package JavaPractice1;
interface Printable{
	void print();
}
interface Showable{
	void show();
}
public class A7 implements Printable,Showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A7 a=new A7();
a.print();
a.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("showable method................");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printable method...............");
	}

}
