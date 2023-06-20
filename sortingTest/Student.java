package sortingTest;

public class Student implements Comparable<Student> 
{
	
	int rno;
	String name;
	
	public Student(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}

	
	@Override
	public int compareTo(Student o) {
		
		/* if(rno == o.rno) {
			return 0;
		} else if (rno > o.rno) {
			return 1;
		} else {
		   return -1;
		} */
		
		return name.compareTo(o.name);
	}
	
	

}
