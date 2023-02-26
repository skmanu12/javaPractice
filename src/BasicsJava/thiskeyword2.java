package BasicsJava;

public class thiskeyword2 {
	thiskeyword2(){
		System.out.println("hello thiskeyword2");
	}
	thiskeyword2(int x){
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//thiskeyword2 t=new thiskeyword2();
		thiskeyword2 t1=new thiskeyword2(10);
	}

}
