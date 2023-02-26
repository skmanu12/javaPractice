package Basic1;

public class ConstructorChainingUsingthiskeyword {
	int id;
	String name;
	int age;
	ConstructorChainingUsingthiskeyword(int id,String name){
		this.id=id;
		this.name=name;
	}
	ConstructorChainingUsingthiskeyword(int id,String name,int age){
		this(id, name);
		this.age=age;
	}
void display() {
	System.out.println(id+"-"+name+"-"+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstructorChainingUsingthiskeyword c=new ConstructorChainingUsingthiskeyword(11, "Manappa");
		ConstructorChainingUsingthiskeyword c1=new ConstructorChainingUsingthiskeyword(12, "Seeat",34);
		//c.display();
		c1.display();
	}

}
