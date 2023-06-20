package sortingTest;

import java.util.Comparator;

public class EmployeeIDSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if(o1.id == o2.id) {
			return 0;
		} else if(o1.id > o2.id) {
			return 10;
		} else {
			return -20;
		}
	}

}
