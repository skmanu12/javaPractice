package JavaPractice1;
interface Honda123{
	abstract void run();
}
interface Bike12{
	abstract void move();
}
class Car implements Honda123,Bike12{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running honda");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Move Bike");
	}
	
}
public class MultipleInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.run();
		c.move();
	}

}
