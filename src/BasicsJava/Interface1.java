package BasicsJava;
interface bank2{
	float rateOfIntrest();
}
class sbi1 implements bank2{

	@Override
	public float rateOfIntrest() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}
class axis1 implements bank2{

	@Override
	public float rateOfIntrest() {
		// TODO Auto-generated method stub
		return 9;
	}
	
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bank2 b=new sbi1();
System.out.println(b.rateOfIntrest());


	}

}
