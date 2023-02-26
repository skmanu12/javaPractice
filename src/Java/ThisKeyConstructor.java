package Java;

public class ThisKeyConstructor {
	ThisKeyConstructor(){
		System.out.println("Its empty constructor");
	}
	ThisKeyConstructor(int x){
		this();
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyConstructor s=new ThisKeyConstructor(10);
	}

}
