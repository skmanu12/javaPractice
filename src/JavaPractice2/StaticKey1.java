package JavaPractice2;

public class StaticKey1 {
int id;
String name;
static String College="BDIT";
StaticKey1(int i,String n){
	id=i;
	name=n;
	
}
void display() {
	System.out.println(id+" "+name+" "+College);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKey1 s=new StaticKey1(11, "Manappa");
		StaticKey1 s1=new StaticKey1(12, "Mahantesh");
		StaticKey1 s2=new StaticKey1(13, "Shree");
		s.display();
		s1.display();
		s2.display();
	}

}
