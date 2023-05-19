package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentsArrayList {
	private static final String StudentsArrayList = null;
	String name;
	int rollno;
	int age;

	StudentsArrayList(int rollno, String name, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsArrayList s1 = new StudentsArrayList(2, "Manappa", 34);
		StudentsArrayList s2 = new StudentsArrayList(1, "Sharan", 28);
		StudentsArrayList s3 = new StudentsArrayList(3, "Shashi", 26);
		ArrayList<StudentsArrayList> l = new ArrayList<StudentsArrayList>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		Iterator it = l.iterator();
		while (it.hasNext()) {
			StudentsArrayList st = (StudentsArrayList) it.next();
			System.out.println(st.rollno + "-" + st.name + "-" + st.age);

		}
	}

}
