package PatternPrograms;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Right angle triangle
 * * * *
 * * *
 * *
 *
		 */
		
		for(int i=4;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
