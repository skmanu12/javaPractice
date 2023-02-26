package ProgramsOnArray;

public class DescendingOrderArray {

	public static void main(String[] args) {
int[] a= {7,5,3,20};
for(int b:a) {
	System.out.print(b);
}
System.out.println(a);
int temp=0;
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]<a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	
	
}
	}
}
