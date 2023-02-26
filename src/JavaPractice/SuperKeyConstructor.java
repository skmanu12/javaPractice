package JavaPractice;
class Animal3{
	Animal3(){
		System.out.println("Animal is eating......");
	}
}
class Dog4 extends Animal3{
	
	Dog4(){
//super();
		System.out.println("Dog3 is eating");
	}
	
}
public class SuperKeyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog4 d=new Dog4();
	}

}
