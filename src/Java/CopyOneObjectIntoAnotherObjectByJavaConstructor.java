package Java;

public class CopyOneObjectIntoAnotherObjectByJavaConstructor {
int id;
String name;
CopyOneObjectIntoAnotherObjectByJavaConstructor(int i,String n){
	id=i;
	name=n;
}
CopyOneObjectIntoAnotherObjectByJavaConstructor(CopyOneObjectIntoAnotherObjectByJavaConstructor c){
	id=c.id;
	name=c.name;
}
void display() {
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOneObjectIntoAnotherObjectByJavaConstructor c=new CopyOneObjectIntoAnotherObjectByJavaConstructor(12,"Manappa");
		CopyOneObjectIntoAnotherObjectByJavaConstructor c1=new CopyOneObjectIntoAnotherObjectByJavaConstructor(c);
		c.display();
		c1.display();
	}

}
