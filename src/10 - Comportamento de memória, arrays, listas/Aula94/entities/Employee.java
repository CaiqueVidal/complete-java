package entities;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public static Integer idIndex(List<Employee> list, int id) {
		for (int i =0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public double increaseSalary(double percent) {
		return salary += salary*(percent/100);
	}
	
	
	public String toString() {	
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}
