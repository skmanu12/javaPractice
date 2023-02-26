package Java;

public class Static {
int rollNo;
String name;
static String college="ITI";
public static void change() {
	college="BDIT";
}
Static(int r,String n){
	rollNo=r;
	name=n;
}
void display() {
	System.out.println(rollNo+"-"+name+"-"+college);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static s=new Static(12, "Manappa");
		Static.change();
		s.display();
	}

}
