package JavaPractice;

public class Student1 {
int id;
String name;
Student1(int i,String n){
	id=i;
	name=n;
}
Student1(){
	
}
void display() {
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(111,"Jeeavan");
		Student1 s2=new Student1();
		s2.id=s1.id;
		s2.name=s1.name;
		s1.display();
		s2.display();
	}

}
