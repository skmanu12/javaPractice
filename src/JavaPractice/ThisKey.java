package JavaPractice;

public class ThisKey {
	void m() {
		System.out.println("Method M");
	}
	void n() {
		System.out.println("Method N");
		this.m();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKey t=new ThisKey();
		t.n();
	}

}
