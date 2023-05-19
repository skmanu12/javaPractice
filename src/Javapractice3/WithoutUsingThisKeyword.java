package Javapractice3;

public class WithoutUsingThisKeyword {
int id;
String name;
float age;
WithoutUsingThisKeyword(int id,String name,float age){
	id=id;
	name=name;
	age=age;
}
void display() {
	System.out.println(id+" "+name+" "+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutUsingThisKeyword w=new WithoutUsingThisKeyword(11,"Mahesh",35);
		w.display();
		
	}

}
