package Java;
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
class Emp{
	int id;
	String name;
	Address address;
	Emp(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	void display(){
		System.out.println(id+"-"+name+"-"+address.state+"-"+address.city+"-"+address.country);
	}
}

public class AggregationsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address("Ka", "Shahapur", "India");
		Emp e=new Emp(12, "Manappa", address);
		e.display();
	}

}
