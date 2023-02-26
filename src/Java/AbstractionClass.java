package Java;
abstract class Bank{
	abstract int getRateOfIntrest(); 
}
class SBI extends Bank{

	@Override
	int getRateOfIntrest() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}
public class AbstractionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank a=new SBI();
System.out.println(a.getRateOfIntrest());
//a.getRateOfIntrest();

	}

}
