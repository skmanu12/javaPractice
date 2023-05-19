package Javapractice3;
interface Manappa{
	void designation();
}
interface Mahanetsh{
	void designation();
}
class Santosh implements Manappa,Mahanetsh{

	@Override
	public void designation() {
		// TODO Auto-generated method stub
		System.out.println("Specialist");
	}
	
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Santosh s=new Santosh();
		s.designation();
	}

}
