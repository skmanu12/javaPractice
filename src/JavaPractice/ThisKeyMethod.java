package JavaPractice;

public class ThisKeyMethod {
	void m() {
		System.out.println("M method");
	}
void n() {
	m();
	System.out.println("N method");
	
}
void o() {
	this.n();
	System.out.println("O method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyMethod m1=new ThisKeyMethod();
		m1.o();
	}

}
