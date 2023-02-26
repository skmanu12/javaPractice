package JavaPractice2;

public class CopyByConstructor {
int id;
String name;
CopyByConstructor(int i,String n){
	id=i;
	name=n;
}
CopyByConstructor(CopyByConstructor c){
	id=c.id;
	name=c.name;
}
void display(){
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyByConstructor c1=new CopyByConstructor(11,"Manappa");
		CopyByConstructor c2=new CopyByConstructor(c1);
		c1.display();
		c2.display();
	}

}
