package JavaPractice1;

public class BlankFinalVariable {
final int speedlinit;
static final int data;
static {data=300;}
BlankFinalVariable(){
	speedlinit=400;
	System.out.println(speedlinit);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlankFinalVariable b=new BlankFinalVariable();
		System.out.println(BlankFinalVariable.data);
	}

}
