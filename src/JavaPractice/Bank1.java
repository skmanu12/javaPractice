package JavaPractice;
class Bank{
	int getRateOfIntrest() {
		return 8;
	}
}
class SBI extends Bank{
	int getRateOfIntrest() {
		return 7;
		
	}
}
class ICICI extends Bank{
	int getRateOfIntrest() {
		return 5;
		
	}
}
class Axis extends Bank{
	int getRateOfIntrest() {
		return 6;
		
	}
}
public class Bank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s1=new SBI();
		ICICI c=new ICICI();
		Axis a=new Axis();
		System.out.println(s1.getRateOfIntrest());
		System.out.println(c.getRateOfIntrest());
		System.out.println(a.getRateOfIntrest());
	}

}
