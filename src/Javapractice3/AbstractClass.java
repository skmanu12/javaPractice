package Javapractice3;
abstract class RBI{
	abstract int getRateOfIntrest();
}
class icici extends RBI{

	@Override
	int getRateOfIntrest() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}
class PNB extends RBI{

	@Override
	int getRateOfIntrest() {
		// TODO Auto-generated method stub
		return 9;
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RBI r=new icici();
RBI p=new PNB();
System.out.println(r.getRateOfIntrest());
System.out.println(p.getRateOfIntrest());

	}

}
