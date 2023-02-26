package JavaPractice1;
abstract class Bank01{
	abstract int getRateOfIntrest();
}
class hdfc01 extends Bank01{

	@Override
	int getRateOfIntrest() {
		// TODO Auto-generated method stub
		return 7;
	}

}
class axis01 extends Bank01{

	@Override
	int getRateOfIntrest() {
		// TODO Auto-generated method stub
		return 6;
	}
	
}
class icici01 extends Bank01{

	@Override
	int getRateOfIntrest() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}
class idbi extends Bank01{

	@Override
	int getRateOfIntrest() {
		// TODO Auto-generated method stub
		return 9;
	}
	
}
public class TestBank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank01 b;
		b=new idbi();
		System.out.println("Rate of intrest for IDBI:"+b.getRateOfIntrest());
		b=new icici01();
		System.out.println("Rate of intrest for ICICI:"+b.getRateOfIntrest());
		
	}

}
