package Basic1;

public class ConstructorDefault {
int id;
String name;
void display() {
	System.out.println(id+"-"+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDefault c=new ConstructorDefault();
		c.display();
	}

}
