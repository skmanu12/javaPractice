package Collection2;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {
int rollno;
String name;
String place;
StudentArrayList(int rollno,String name,String place){
	this.rollno=rollno;
	this.name=name;
	this.place=place;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentArrayList s1=new StudentArrayList(1,"Sneha","bangalore");
		StudentArrayList s2=new StudentArrayList(2,"Chetana","Bidar");
		StudentArrayList s3=new StudentArrayList(3,"Manappa","Yadgiri");
		
		ArrayList<StudentArrayList> li=new ArrayList<StudentArrayList>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		/*Iterator i=li.iterator();
		while(i.hasNext()) {
			StudentArrayList st	=(StudentArrayList) i.next();
			System.out.println(st.rollno+"--"+st.name+"--"+st.place);
		}
		*/
		for(StudentArrayList s:li) {
			System.out.println(s.rollno+"--"+s.name+"--"+s.place);
		}
	}

}
