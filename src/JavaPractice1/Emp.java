package JavaPractice1;
class Address{
	String city;
	String state;
	String country;
	Address(String city,String state,String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
public class Emp {
int id;
String name;
Address address;
Emp(int id,String name,Address address){
	this.id=id;
	this.name=name;
	this.address=address;
}
void display() {
	System.out.println(id+"="+name);
	System.out.println(address.city+"-"+address.state+"-"+address.country);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1=new Address("Shahaput", "Karnataka", "India");
		Emp e=new Emp(123, "Manu", address1);
		e.display();

	}

}
