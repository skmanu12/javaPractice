package Java;

public class ThisKeyMethod {
	public void n() {
		System.out.println("Its n class");
	}
	public void m() {
		this.n();
		System.out.println("Its m class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyMethod a=new ThisKeyMethod();
		a.m();
	}

}
