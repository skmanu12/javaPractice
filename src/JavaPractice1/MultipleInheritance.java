package JavaPractice1;
interface prinable2{
	void print();
}
interface showable2{
	void print();
}
public class MultipleInheritance implements prinable2,showable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance m=new MultipleInheritance();
		m.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Method is prinatble.....");
	}

}
