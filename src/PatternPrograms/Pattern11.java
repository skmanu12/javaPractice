package PatternPrograms;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       for (int i = 1; i < 5 + 1; i++) 
	       { 
	    	   for (int j = 5; j > i; j--) {  
	               System.out.print(" ");  
	           }  
	           for (int k = 0; k < (2 * i - 1); k++) {  
	               System.out.print("*");  
	           }  
	           System.out.println();  
	         }  
	}

}
