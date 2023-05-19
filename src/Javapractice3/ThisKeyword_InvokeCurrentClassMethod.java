package Javapractice3;

public class ThisKeyword_InvokeCurrentClassMethod {
	/*
	 * You may invoke the method of the current class by using the this keyword. 
	 * If you don't use the this keyword, compiler automatically adds this keyword 
	 * while invoking the method. Let's see the example
	 * 
	 */
	void m() {
		System.out.println("M Methd");
	}
	void n() {
		m();
		System.out.println("n Methd");
	}
	void p() {
		System.out.println("P Method");
	}
	void q() {
		this.p();
		System.out.println("Q Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword_InvokeCurrentClassMethod m=new ThisKeyword_InvokeCurrentClassMethod();
		m.n();
		m.q();
	}

}
