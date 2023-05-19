package JavaPractice;

public class CopyValuesByConstructor {
	int id;
	String name;
	CopyValuesByConstructor(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	CopyValuesByConstructor(CopyValuesByConstructor s){
		id=s.id;
	name=s.name;
		
	}
	void display() {
		System.out.println(id+"-"+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyValuesByConstructor c1=new CopyValuesByConstructor(11,"Manappa");
		CopyValuesByConstructor c2=new CopyValuesByConstructor(c1);
		c1.display();
		c2.display();
	}

}
