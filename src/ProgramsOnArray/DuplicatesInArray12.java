package ProgramsOnArray;

public class DuplicatesInArray12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,9,4,4,2};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
