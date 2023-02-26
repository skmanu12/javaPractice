package JavaPractice1;
class Student{
private int id;

public int getInt() {
	return id;
}
public void setInt(int id) {
	this.id=id;
}
	
}
public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setInt(123);
		System.out.println(s.getInt());
	}

}
