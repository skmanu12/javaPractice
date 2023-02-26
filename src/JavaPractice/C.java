package JavaPractice;
class A {
	void displayed() {
		System.out.println("A Class");
	}
}
class B extends A{
	void shows() {
		System.out.println("B Class");
	}
}
class C extends B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c=new C();
c.displayed();
c.shows();

	}

}
