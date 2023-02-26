package JavaPractice2;

public class thisInvokeConstructor {
	thisInvokeConstructor(){
		System.out.println("Constructor 'A'");
	}
	thisInvokeConstructor(int x){
		this();
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisInvokeConstructor t=new thisInvokeConstructor(10);
	}

}
