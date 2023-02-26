package JavaPractice;

public class Constructor {
	int id;
	String name;
	int age;
	Constructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	Constructor(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	void shows() {
		System.out.println("Student Info:"+id+"-"+name+"-"+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor(100, "Manappa");
		Constructor c1=new Constructor(100, "Manappa",23);
		c.shows();
		c1.shows();
	}

}
