package PatternPrograms;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1***
		 * 12**
		 * 123*
		 * 1234
		 */
		int i, j;
		int space=0;
		for (i = 1; i <= 4; i++) {
			 
			for (j = 1; j <= 4; j++) {

				if (j<=i) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}

			}
			

			System.out.println();
		}
	
		
	}
}
