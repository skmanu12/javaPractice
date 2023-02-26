package BasicsJava;

public class ThisKeyword {
	int id;
	String name;
	float feet;
	ThisKeyword(int id,String name,float feet){
		this.id=id;
		this.name=name;
		this.feet=feet;
		
	}
	void display() {
		System.out.println(id+" "+name+" "+feet);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword t=new ThisKeyword(1,"Manappa",5);
		t.display();
	

	}

	

}
