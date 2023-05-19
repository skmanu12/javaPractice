package PatternPrograms;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 12345
 1234
 123
 12
 1
 */
		
	for(int i=5;i>=0;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	
	}

}
