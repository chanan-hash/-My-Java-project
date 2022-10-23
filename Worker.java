// בגרות 2016 שאלה 4, המחלקה

package A;

public class Worker {

	private String name;
	private int salary;
	
	public Worker(String name,int salary) {
		this.name = name;
		this.salary = salary; 
	}
	
	public boolean isBig() {
		return this.salary > 9000;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", salary=" + salary + "]";
	}
	
}
