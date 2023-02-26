package PatternPrograms;

public class StarPatternsRightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		*/
		int i,j, n=7;  
		   System.out.println("Right angle triangle");  
		   for(i=1;i<=n;i++)  
		   {  
		   for(j=1;j<=i;j++)  
		   {  
		       System.out.print("*");  
		   }  
		       System.out.println("");  
		   }  
		   
		    
		   System.out.println("Right angle triangle");  
		   int k,l,m=7;
		   for(k=m;k>=0;k--)  
		   {  
		   for(l=1;l<=k;l++)  
		   {  
		       System.out.print("*");  
		   }  
		       System.out.println("");  
		   }  

	}

}
