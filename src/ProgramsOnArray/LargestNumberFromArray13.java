package ProgramsOnArray;

public class LargestNumberFromArray13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,1,7,9};
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println(max);
	}

}
