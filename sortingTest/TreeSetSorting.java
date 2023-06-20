package sortingTest;

import java.util.TreeSet;

public class TreeSetSorting {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(8);
		ts.add(5);
		ts.add(3);
		
		for (Integer val : ts) {
			System.out.println(val);
		}
		
		
		
		TreeSet<Student> sts = new TreeSet<>();
		
		sts.add(new Student(5, "Rushank"));
		sts.add(new Student(9, "Pallavi"));
		sts.add(new Student(3, "Shagufta"));
		sts.add(new Student(3, "Rushikesh"));
		
		for (Student student : sts) {
			System.out.println(student.rno +" "+ student.name);
		}
		
		
	}

}
