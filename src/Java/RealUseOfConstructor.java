package Java;

public class RealUseOfConstructor {
int rollNo;
String name;
String course;
float fee;
RealUseOfConstructor(int rollNo,String name,String course){
	this.rollNo=rollNo;
	this.name=name;
	this.course=course;
}
RealUseOfConstructor(int rollNo,String name,String course,float fee){
	this(rollNo, name, course);
	this.fee=fee;
	
}
void display() {
	System.out.println(rollNo+"-"+name+"-"+fee+"-"+fee);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealUseOfConstructor r1=new RealUseOfConstructor(12,"Manappa","API");
		RealUseOfConstructor r2=new RealUseOfConstructor(13,"Santosh","Mobile",20000);
		r1.display();
		r2.display();
	}

}
