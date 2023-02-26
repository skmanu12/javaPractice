package JavaPractice2;

public class Student1 {
int id;
String name;
int age;
Student1(int i,String n){
	id=i;
	name=n;
}
Student1(int i,String n,int a){
	id=i;
	name=n;
	age=a;
}
void display(){
	System.out.println(id+" "+name+" "+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1(11,"Manu");
		Student1 s1=new Student1(12, "Shree",34);
		s.display();
		s1.display();
	}

}
