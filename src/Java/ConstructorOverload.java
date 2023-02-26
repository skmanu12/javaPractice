package Java;

public class ConstructorOverload {
	int id;
	String name;
	String college;
	ConstructorOverload(int i,String n){
		id=i;
		name=n;
	}
	ConstructorOverload(int i,String n,String c){
		id=i;
		name=n;
		college=c;
	}
	void display() {
		System.out.println(id+"-"+name+"-"+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverload c=new ConstructorOverload(11,"Manappa");
		ConstructorOverload c1=new ConstructorOverload(12, "Santosh", "RIIIT");
		c.display();
		c1.display();
	}

}
