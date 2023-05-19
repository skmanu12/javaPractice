package Javapractice3;

public class CopyOneObjectIntoAnotherObjectByWithoutConstructor {
int id;
String name;
CopyOneObjectIntoAnotherObjectByWithoutConstructor(int i,String n){
	id=i;
	name=n;
}
CopyOneObjectIntoAnotherObjectByWithoutConstructor(){
	
}
void display() {
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOneObjectIntoAnotherObjectByWithoutConstructor c1=new CopyOneObjectIntoAnotherObjectByWithoutConstructor(11,"Manappa");
		CopyOneObjectIntoAnotherObjectByWithoutConstructor c2=new CopyOneObjectIntoAnotherObjectByWithoutConstructor();
		
		c2.id=c1.id;
		c2.name=c1.name;
		c1.display();
		c2.display();
	}

}
