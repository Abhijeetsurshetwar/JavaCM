package sortingTest;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSortTest {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> eal = new ArrayList<>();
		eal.add(new Employee(10, "Umesh"));
		eal.add(new Employee(5, "Ramesh"));
		eal.add(new Employee(7, "Gajana"));
		
		Collections.sort(eal, new EmployeeNameSorting());
		
		for (Employee employee : eal) {
			System.out.println(employee.id + " " +employee.name );
		}
		
	}

}
