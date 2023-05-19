package JavaPractice;

public class StaticMethod {
	//Java static property is shared to all objects.
	int id;
	String name;
	static String college="BDIT";
	StaticMethod(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	static void change() {
		college="KCT";
	}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticKeyWord.college
		StaticMethod.change();
		StaticMethod m1=new StaticMethod(1,"Manappa");
		StaticMethod m2=new StaticMethod(2,"Jeeva");
		m1.display();
		m2.display();
		
	}

}
