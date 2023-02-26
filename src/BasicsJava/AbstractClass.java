package BasicsJava;
abstract class Bank{
	abstract int getRateOfIntrest();
}
class hdfc extends Bank{

	
	int getRateOfIntrest() {
		return 7;
	}
}
class axis extends Bank{

	@Override
	int getRateOfIntrest() {
		// TODO Auto-generated method stub
		return 9;
	}
	
} 
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b=new hdfc();
System.out.println(b.getRateOfIntrest());

Bank a=new axis();
System.out.println(a.getRateOfIntrest());
	}

}
