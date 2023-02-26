package Java;

public class ThisKeyVariables {
int id;
String name;
ThisKeyVariables(int id,String name){
	this.id=id;
	this.name=name;
}
void display() {
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyVariables s=new ThisKeyVariables(12,"Manappa");
		s.display();
	}

}
