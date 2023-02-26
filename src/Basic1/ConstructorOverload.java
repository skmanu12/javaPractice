package Basic1;

public class ConstructorOverload {
int id;
String name;
int age;
ConstructorOverload(int id,String name){
	this.id=id;
	this.name=name;
}
ConstructorOverload(int id,String name,int age){
	this.id=id;
	this.name=name;
	this.age=age;
}
void display() {
	System.out.println(id+"-"+name+"-"+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverload c=new ConstructorOverload(11,"Manu");
		ConstructorOverload c2=new ConstructorOverload(12,"Seeta",30);
		c.display();
		c2.display();
	}

}
