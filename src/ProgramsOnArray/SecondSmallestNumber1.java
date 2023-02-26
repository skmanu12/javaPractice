package ProgramsOnArray;

public class SecondSmallestNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,0,4};
		int min=a[0];
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<min) {
				min=a[i];
				System.out.print(min);
			}
			
		}

	}

}
