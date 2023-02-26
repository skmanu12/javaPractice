package PatternPrograms;

public class pattern4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* A
		 * BB
		 * CCC
		 * EEEE
		 */
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(65+i));
			}
			System.out.println();
		}
	
	}

}
