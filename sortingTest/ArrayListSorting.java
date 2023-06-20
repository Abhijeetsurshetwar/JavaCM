package sortingTest;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListSorting {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Shubham");
		al.add("Pallavi");
		al.add("Ritesh");
		
		Collections.sort(al);
		
		for (String val : al) {
			System.out.println(val);
		}
		
		
		
		ArrayList<Student> sal = new ArrayList<>();
		sal.add(new Student(5, "Rushank"));
		sal.add(new Student(9, "Pallavi"));
		sal.add(new Student(3, "Shagufta"));
		sal.add(new Student(3, "Rushikesh"));
		
		Collections.sort(sal);
		
		for (Student student : sal) {
			System.out.println(student.rno +" "+ student.name);
		}
	}

}
