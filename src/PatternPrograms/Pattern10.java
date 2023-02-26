package PatternPrograms;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
		 */
		int i ,j; 
		int k=1;
	       int n = 6;    
	           for(i=1;i<=5;i++) {
	        	   for(j=1;j<=i;j++) {
	        		   System.out.print(k);
	        		   k++;
	        	   }
	        	   System.out.println();
	           }
	}

}
