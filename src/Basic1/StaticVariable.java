package Basic1;

public class StaticVariable {
	int id;
	String name;
	static String college="ITC Info College of Engineering";
	StaticVariable(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+"-"+name+"-"+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable s=new StaticVariable(11,"Manappa");
		StaticVariable s1=new StaticVariable(12,"Kiran");
		StaticVariable s2=new StaticVariable(13,"Jyothi");
		s.display();
		s1.display();
		s2.display();
	}

}
