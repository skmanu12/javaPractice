package ProgramsOnArray;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,2,4,1,7,3,7,7};
Set s=new HashSet();
//StringBuilder sb=new StringBuilder();
for(int i=0;i<a.length;i++) {
	if(!s.contains(a[i])) {
		s.add(a[i]);
	}
	
}
System.out.println(s);

for(int i=0;i<a.length;i++) {
	int count = 0;
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]) {
			count++;
		}
	}
	if(count==1) {
		System.out.print(a[i]);
	}
	

}

	}

}
