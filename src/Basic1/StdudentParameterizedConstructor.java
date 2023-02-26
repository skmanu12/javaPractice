package Basic1;

public class StdudentParameterizedConstructor {
int id;
String name;
StdudentParameterizedConstructor(int id,String name){
	this.id=id;
	this.name=name;
}
void display() {
	System.out.println(id+"-"+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdudentParameterizedConstructor s=new StdudentParameterizedConstructor(11,"Manu");
		s.display();
	}

}
