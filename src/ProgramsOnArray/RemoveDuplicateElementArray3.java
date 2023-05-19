package ProgramsOnArray;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4,2,4,1,7,3,7,7};
Set s=new HashSet();
for(int i=0;i<a.length;i++) {
	if(!s.contains(a[i])) {
		s.add(a[i]);
	}
	
}
System.out.println(s);
	}

}
