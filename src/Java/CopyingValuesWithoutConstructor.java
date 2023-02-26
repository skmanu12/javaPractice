package Java;

public class CopyingValuesWithoutConstructor {
	int id;
	String name;
	CopyingValuesWithoutConstructor(int i,String n){
		id=i;
		name=n;
	}
	CopyingValuesWithoutConstructor(){}
	void display() {
		System.out.println(id+"-"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyingValuesWithoutConstructor c=new CopyingValuesWithoutConstructor(12,"Manappa");
		CopyingValuesWithoutConstructor c1=new CopyingValuesWithoutConstructor();
		c1.id=c.id;
		c1.name=c.name;
		c1.display();
		c1.display();
	}

}
