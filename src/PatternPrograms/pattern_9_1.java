package PatternPrograms;

public class pattern_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
1
12
123
1234
1234
123
12
1
 */
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
