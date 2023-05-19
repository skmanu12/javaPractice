package JavaPractice;

public class ThisKeyConstructor {
	ThisKeyConstructor(){
		System.out.println("First Constructor");
	}
	ThisKeyConstructor(int x){
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyConstructor a=new ThisKeyConstructor(10);
	}

}
