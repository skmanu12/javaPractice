package BasicsJava;

public class thiskeyword1 {
	void m() {
		System.out.println("Printing m");
	}
	void n() {
		m();
		System.out.println("Printing n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword1 t=new thiskeyword1();
		t.n();
	}

}
