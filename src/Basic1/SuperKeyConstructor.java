package Basic1;
class Manu{
	Manu(){
		System.out.println("Manu is constructor");
	}
}
class Maha extends Manu{
	Maha(){
		super();
		System.out.println("Maha is constructor");
	}
}

public class SuperKeyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maha m=new Maha();
	}

}
