package BasicsJava;

public class staticKeyword1 {
	int id=123;
	String name="Manappa";
	static String college="ITC";
	
	staticKeyword1(int i,String n){
		id=i;
		name=n;
	}
	static void change() {
		college="BDIT";
	}
	public void display() {
		System.out.println(id+"-"+name+"-"+college);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticKeyword1 s=new staticKeyword1(1, "Manappa");
		staticKeyword1 s1=new staticKeyword1(2, "Bassu");
		staticKeyword1.change();
		s.display();
		s1.display();
	}

}
