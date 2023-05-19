package PatternPrograms;

public class pattern_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A 
		 * BB 
		 * CCC 
		 * DDDD
		 */
	for(int i=0;i<5;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print((char)(65+i));
			
		}
		System.out.println();
	}

	}

}
