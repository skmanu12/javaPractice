package Java;

public class StudentConstuctor {
	int id;
	String name;

	StudentConstuctor(int r, String n) {
		id = r;
		name = n;
	}
void display() {
	System.out.println(id+"-"+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentConstuctor s=new StudentConstuctor(123,"Manappa");
		s.display();
	}

}
