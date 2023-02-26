package Java;

public class AnynomousInClass2 {
	void fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnynomousInClass2().fact(5);
		
		
	}

}
