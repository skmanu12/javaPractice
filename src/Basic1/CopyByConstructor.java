package Basic1;

public class CopyByConstructor {
	int id;
	String name;
	CopyByConstructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	CopyByConstructor(CopyByConstructor c){
		this.id=c.id;
		this.name=c.name;
	}
	
	void display()
	{
		System.out.println(id+"-"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyByConstructor c=new CopyByConstructor(11,"Manappa");
		CopyByConstructor c1=new CopyByConstructor(c);
		c.display();
		c1.display();
	}

}
