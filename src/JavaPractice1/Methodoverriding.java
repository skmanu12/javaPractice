package JavaPractice1;
class Bank{
	 int getRatOfInterest(){
		 return 0;
	 }
}
class SBI extends Bank{
	int getRatOfInterest(){
		 return 8;
	 }
}
class Axis extends Bank{
	int getRatOfInterest(){
		 return 7;
	 }
}
class ICICI extends Bank{
	int getRatOfInterest(){
		 return 9;
	 }
}
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI s=new SBI();
Axis a=new Axis();
ICICI i=new ICICI();
System.out.println(s.getRatOfInterest());
System.out.println(a.getRatOfInterest());
System.out.println(i.getRatOfInterest());
	}

}
