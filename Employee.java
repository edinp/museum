package ba.bitcamp.day48.test.zaid;

import java.util.StringTokenizer;

public class Employee implements Searchable, Comparable<Employee> {
	
	private String employeeName;
	private int salary;
	
	/*
	 * Constructor for object Employee.
	 */
	public Employee(String name, int salary) {
		this.employeeName = name;
		this.salary = salary;
	}
	
	public String toString() {
		return employeeName + " (salary: " + salary + ")";
	}

	/*
	 * Getters and setters.
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	/*
	 * Searching through an object for entered String.
	 */
	@Override
	public boolean fitsSearch(String str) {
		StringTokenizer st = new StringTokenizer(this.employeeName, " ");
		while (st.hasMoreTokens()) {
			if (st.nextToken().equalsIgnoreCase(str)) {
				return true;
			}
		}
		if (String.valueOf(salary).equals(str)) {
			return true;
		}
		return false;
	}

	/*
	 * Comparing employees by their names.
	 */
	@Override
	public int compareTo(Employee o) {
		return this.employeeName.compareTo(o.employeeName);
	}
	
	

}
