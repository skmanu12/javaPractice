package JavaPractice2;

public class thisInvokesCurrentClassMethod {
	void m() {
		System.out.println("M is the method of class");
	}
	void n() {
		System.out.println("n is the method");
		this.m();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisInvokesCurrentClassMethod t=new thisInvokesCurrentClassMethod();
		t.n();
	}

}
