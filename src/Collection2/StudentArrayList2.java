package Collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StudentArrayList2 {
	int id;
	String name;
	String college;
	StudentArrayList2(int id,String name,String college){
		this.id=id;
		this.name=name;
		this.college=college;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentArrayList2 s1=new StudentArrayList2(111,"Santosh","ITPL");
		StudentArrayList2 s2=new StudentArrayList2(112,"Mahantesh","Kct");
		StudentArrayList2 s3=new StudentArrayList2(113,"Santosh","RYMEC");
		ArrayList<StudentArrayList2> list =new ArrayList<StudentArrayList2>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for(StudentArrayList2 l:list) {
			System.out.println(l.id+"-"+l.name+"-"+l.college);
			
		}
	}

}
