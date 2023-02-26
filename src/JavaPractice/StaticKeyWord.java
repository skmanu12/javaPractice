package JavaPractice;

public class StaticKeyWord {
	int id;
	String name;
	static String college="ITS";

	static void change() {
		college="BDIT";
	}
	StaticKeyWord(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticKeyWord.college
		StaticKeyWord.change();
		StaticKeyWord s1=new StaticKeyWord(111,"Manu");
		StaticKeyWord s2=new StaticKeyWord(112,"Seeta");
		s1.display();
		s2.display();
		
	}

}
