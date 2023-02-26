package JavaPractice1;
class Student1{
	private String name;
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return name;
	}
}
public class Encapsulation12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1();
		s.setName("Manappa");
		System.out.println(s.getName());
	}

}
