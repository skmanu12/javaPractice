//package Javapractice3;
class Bank{
	int getRateOfIntrest() {
		return 8;
	}
}
class ICICI extends Bank{
	int getRateOfIntrest() {
		return 7;
	}
}
class Axis extends Bank{
	int getRateOfIntrest() {
		return 9;
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICI i=new ICICI();
		Axis a=new Axis();
		System.out.println(i.getRateOfIntrest());
		System.out.println(a.getRateOfIntrest());
		
	}

}
