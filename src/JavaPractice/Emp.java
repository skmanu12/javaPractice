package JavaPractice;
class Address{
	String state;
	String city;
	String country;
	Address(String state,String city,String country){
		this.state=state;
		this.city=city;
		this.country=country;
	}
}
public class Emp {
int id;
String name;
Address address;
public void displayed() {
	System.out.println(id+" "+name);
	System.out.println(address.state+"-"+address.city+"-"+address.country);
}

public Emp(int id,String name,Address address) {
	this.id=id;
	this.name=name;
	this.address=address;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1=new Address("Ka", "GLB", "India");
		Emp e=new Emp(1, "Manu", address1);
		e.displayed();
	}

}
