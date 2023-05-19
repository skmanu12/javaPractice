package Javapractice3;

public class CopyOneObjectIntoAnotherObjectByConstructor {
	int id;
	String name;
	
	CopyOneObjectIntoAnotherObjectByConstructor(int i,String n){
		id=i;
		name=n;
	}
	CopyOneObjectIntoAnotherObjectByConstructor(CopyOneObjectIntoAnotherObjectByConstructor c){
		id=c.id;
		name=c.name;
	}
	
	public void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOneObjectIntoAnotherObjectByConstructor c=new CopyOneObjectIntoAnotherObjectByConstructor(11,"Manappa");
		CopyOneObjectIntoAnotherObjectByConstructor c2=new CopyOneObjectIntoAnotherObjectByConstructor(c);
		c.display();
		c2.display();

	}

}
