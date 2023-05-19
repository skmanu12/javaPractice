package PatternPrograms;

public class pattern_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 1
 2 4
 3 6 9
 4 8 12 16
 5 10 15 20 25
 6 12 18 24 30 36
 */
	//i=1,j=1,j<=i
	//		j*i
for(int i=1;i<5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(j*i);
	}
	System.out.println();
}
			
	
	}

}
