package Javapractice3;
interface Shape{
	void draw();
}
class cirle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle is is drawing");
	}
	
}
class square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Squae is drawing");
	}
	
}
public class InterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new square();
		Shape c=new cirle();
		s.draw();
		c.draw();
	}

}
