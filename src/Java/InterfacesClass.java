package Java;
interface Bank12{
	float rateOfIntrest();
}
class SBI2 implements Bank12{

	@Override
	public float rateOfIntrest() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}
public class InterfacesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank12 b=new SBI2();
		b.rateOfIntrest();
		
		
	}

}
