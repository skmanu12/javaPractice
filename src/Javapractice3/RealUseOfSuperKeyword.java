package Javapractice3;
class SuperKeyRealUse{
	int id;
	String name;
	String college;
	
	SuperKeyRealUse(int id,String name,String college){
		this.id=id;
		this.name=name;
		this.college=college;
	}
}
class ChildSuperKeyRealUse extends SuperKeyRealUse{
	double age;
	ChildSuperKeyRealUse(int id,String name,String college,double age){
		super(id,name,college);
		this.age=age;
	}
	void display() {
		System.out.println(id+" "+name+" "+college+" "+age);
	}
}
public class RealUseOfSuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildSuperKeyRealUse c=new ChildSuperKeyRealUse(11,"Manappa","KCT",34);
		c.display();
	}

}
