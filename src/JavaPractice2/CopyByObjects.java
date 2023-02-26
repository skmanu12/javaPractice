package JavaPractice2;

public class CopyByObjects {
	int id;
	String name;
	
	CopyByObjects(int i,String n){
		id=i;
		name=n;
	}
	public CopyByObjects() {
		
	}
	void display(){
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyByObjects c=new CopyByObjects(11,"Manappa");
		CopyByObjects c1=new CopyByObjects();
		c1.id=c.id;
		c1.name=c.name;
		c1.display();
	}

}
