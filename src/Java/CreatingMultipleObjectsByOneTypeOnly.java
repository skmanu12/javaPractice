package Java;

public class CreatingMultipleObjectsByOneTypeOnly {
	int lenght;
	int width;
	CreatingMultipleObjectsByOneTypeOnly(int lenght,int width){
		this.lenght=lenght;
		this.width=width;
	}
public void displayed() {
	System.out.println(lenght+"-"+width);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingMultipleObjectsByOneTypeOnly c1=new CreatingMultipleObjectsByOneTypeOnly(3,4),c2=new CreatingMultipleObjectsByOneTypeOnly(5,6);
		c1.displayed();
		c2.displayed();
		}

}
