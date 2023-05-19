package Javapractice3;

public class FinalVariable {
	final int speed=90;
	void display() {
		/*
		 * There is a final variable speedlimit, we are going to change the value of this variable, 
		 * but It can't be changed because final variable once assigned a value can never be changed.
		 */
	//	speed=90; //can not change the final variable
		int speedLimit=60;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable f=new FinalVariable();
		f.display();
	}

}
