package ProgramsOnArray;

import java.util.Arrays;

public class CopyArraytoAnotherArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {3,2,4,7,9};
int b[]= new int[a.length];
for(int i=0;i<a.length;i++) {
	b[i]=a[i];
}
//System.out.println();
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]);
}
System.out.println();
for(int i=0;i<b.length;i++) {
	System.out.print(+b[i]);
}
	}

}
