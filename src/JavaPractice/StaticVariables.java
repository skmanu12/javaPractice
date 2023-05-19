package JavaPractice;

public class StaticVariables {
	//Java static property is shared to all objects.
	int id;
	String name;
	static String college="BDIT";
	StaticVariables(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticKeyWord.college
		StaticVariables.college="ITS";
		StaticVariables s1=new StaticVariables(1,"Manappa");
		StaticVariables s2=new StaticVariables(2,"Jeeva");
		s1.display();
		s2.display();
		
	}

}
