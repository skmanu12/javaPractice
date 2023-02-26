package JavaPractice2;

public class Employee10 {
int id;
String name;
Address address;
Employee10(int id,String name, Address address){
	this.id=id;
	this.name=name;
	this.address=address;
}
void display() {
	System.out.println(id+"-"+name);
	System.out.println(address.city+"-"+address.state+"-"+address.country);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address("Shahapur", "Karnatak", "India");
		Employee10 e=new Employee10(12, "Seeta", a);
		e.display();
	}

}
