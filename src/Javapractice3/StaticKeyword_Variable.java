package Javapractice3;

public class StaticKeyword_Variable {
	int id;
	String name;
	static String college="KCTE";
	StaticKeyword_Variable(int i,String n){
		id=i;
		name=n;
		
	}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword_Variable s1=new StaticKeyword_Variable(11,"Manappa");
		StaticKeyword_Variable s2=new StaticKeyword_Variable(12,"Jeeva");
		StaticKeyword_Variable s3=new StaticKeyword_Variable(13,"Mava");
		s1.display();
		s2.display();
		s3.display();
	}

}
