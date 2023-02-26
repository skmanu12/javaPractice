package PatternPrograms;

public class pattern_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1***
 * 12**
 * 123*
 * 1234
 */
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
			if(j<=i) {
					System.out.print(j);
			}else {
				System.out.print("*");
			}
			}
			System.out.println();
		}
		
	}

}
