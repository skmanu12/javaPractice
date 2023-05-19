package Javapractice3;

public class StaticKeyword_Method {
int id;
String name;
static String college="KCT";
static void change() {
	college="BDIT";
}
StaticKeyword_Method(int i,String n){
	id=i;
	name=n;
}

void display() {
	System.out.println(id+" "+name+" "+college);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword_Method.change();
		StaticKeyword_Method s1=new StaticKeyword_Method(11,"Manappa");
		StaticKeyword_Method s2=new StaticKeyword_Method(12,"Jeeva");
		//s2.change();
		//s1.change();
		s1.display();
		
		s2.display();
	}

}
