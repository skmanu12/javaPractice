package JavaPractice;

public class Statickey {
	int id;
	String name;
	static String college="ITC College";
	
	Statickey(int id,String name){
		this.id=id;
		this.name=name;
	}
	void displayed() {
		System.out.println("Student Info"+id+"-"+name+"-"+college);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statickey s1=new Statickey(101, "Manappa");
		s1.displayed();
	}

}
