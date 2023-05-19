package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentsArrayList2 {
	int id;
	String name;
	String college;

	StudentsArrayList2(int id, String name, String college) {
		this.id = id;
		this.name = name;
		this.college = college;
	}

	public static void main(String[] args) {
		StudentsArrayList2 s = new StudentsArrayList2(111, "Manu", "bangalore");
		StudentsArrayList2 s1 = new StudentsArrayList2(112, "Jeeva", "ITB bangalore");
		ArrayList<StudentsArrayList2> list = new ArrayList<StudentsArrayList2>();
		list.add(s);
		list.add(s1);
		for (StudentsArrayList2 student : list) {
			System.out.println(student.id + "-" + student.name + "-" + student.college);
		}
	}

}
