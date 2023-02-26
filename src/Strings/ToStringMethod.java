package Strings;

public class ToStringMethod {
int id;
String name;
String College;
ToStringMethod(int id,String name,String College){
	this.id=id;
	this.name=name;
	this.College=College;
}
public String toString() {
	return id+" "+name+"-"+College;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringMethod s1=new ToStringMethod(11,"Jeevan","KCT");
		ToStringMethod s2=new ToStringMethod(12,"Madhu","ITBIT");
		System.out.println(s1);
	}

}
