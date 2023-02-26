package JavaPractice2;

public class Constructor1 {
	Constructor1(){
		System.out.println("A");
	}
	void diplay() {
		System.out.println("Its default constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1 c=new Constructor1();
		c.diplay();
	}

}
