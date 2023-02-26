package JavaPractice2;

public class StaticMethod {
int id;
String name;
static String college="BDIT";
StaticMethod(int i,String n){
	id=i;
	name=n;
}
static void change(){
	//A static method can access static data member and can change the value of it.
	college="KCT Engineering College Gulbarga";
	
}
void display() {
	System.out.println(id+"-"+name+"-"+college);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod s=new StaticMethod(11, "Manappa");
		StaticMethod s1=new StaticMethod(12, "Mahantesh");
		StaticMethod s2=new StaticMethod(13, "Santosh");
		StaticMethod.change();
		s.display();
	}

}
