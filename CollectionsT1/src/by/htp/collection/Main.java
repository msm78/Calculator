package by.htp.collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Create list, and add 3 students:");
		List<Student> list = new LinkedList<Student>();
		list.add(new Student("Ivan", 1997));
		list.add(new Student("Masha", 1998));
		list.add(new Student("Pavel", 2000));
		for (Student st: list)
			System.out.println(st);
		
		System.out.println("\nAfter remove:");
		list.remove(1);
		for (Student st: list)
			System.out.println(st);
		
		System.out.println("\nRead students from file:");
		HashSet<Student> hs = new HashSet<Student>();
		hs.addAll(new ImportFromFile("..\\Students.txt").getList());
		for (Student st: hs)
			System.out.println(st);
		System.out.println("\nStudents with name begin [EYUIOAJ]:");
		for (Student st: hs) {
			if (st.getName().matches("^[EYUIOAJ].*")) {
				System.out.println(st);
			}
		}
	}

}