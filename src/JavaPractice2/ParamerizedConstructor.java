package JavaPractice2;

public class ParamerizedConstructor {
int id;
String name;
ParamerizedConstructor(int i,String n){
	id=i;
	name=n;
}
void display() {
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamerizedConstructor p1=new ParamerizedConstructor(11, "Shree");
		ParamerizedConstructor p2=new ParamerizedConstructor(12, "Manu");
		p1.display();
		p2.display();
	}

}
