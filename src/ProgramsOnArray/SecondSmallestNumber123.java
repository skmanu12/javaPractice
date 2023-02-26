package ProgramsOnArray;

public class SecondSmallestNumber123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {3,2,1,4,5};
int temp;
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
	}
	System.out.print(a[i]);
}

System.out.println();
System.out.println(a[2]);
	}

}
