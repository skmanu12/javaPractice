package Java;
class student{
	int id;
	String name;
}
class student2{
	int rollNo;
	String name;
	void insert(int r,String n) {
		rollNo=r;
		name=n;
	}
	void displaye() {
		System.out.println(rollNo+"-"+name);
	}
}
class student3{
	int empId;
	String empName;
	student3(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	
	void display() {
		System.out.println(empId+"-"+empName);
	}
}
public class ObjectsInitializeObjectBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		student s1=new student();
		s1.id=111;
		s1.name="";
		System.out.println(s1.id+""+s1.name);
		
		//Object Initialization by Method
		student2 s2=new student2();
		s2.insert(112, "Manappa");
		s2.displaye();
		
		//Object Initialization By Constructor
		student3 s3=new student3(2303, "Santosh");
		s3.display();
		
		
	}

}
