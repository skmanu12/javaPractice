package Basic1;

public class CopyConstructorWithoutConstructor {
	int id;
	String name;
	CopyConstructorWithoutConstructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	CopyConstructorWithoutConstructor(){};
	void display() {
		System.out.println(id+"-"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructorWithoutConstructor c=new CopyConstructorWithoutConstructor(11,"Manappa");
		CopyConstructorWithoutConstructor c1=new CopyConstructorWithoutConstructor();
		c1.id=c.id;
		c1.name=c.name;
		c.display();
		c1.display();

	}

}
