package ProgramsOnArray;

public class DescendingOrderArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4, 2, 9, 5 };
		for(int i=0;i<a.length;i++) {
			int temp;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp= a[i];
					a[i]=a[j];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}
