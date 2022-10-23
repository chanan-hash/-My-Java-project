// OOP H.W  1 Un Ariel
package A;

public class Worker_ariel {
// here we gave him the basic characteristic
	private String name;
	private int id, salary;
	
// here we are taking the arguments we'll give the worker and implement them to the characteristic
	public Worker_ariel (String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		
	}
	
// now we're creating a worker that will take the arguments we've put before into the characteristic
	public Worker_ariel(Worker_ariel w) {
		this(w.name,w.id,w.salary);
	}

// getters and setters - if we want to change something specific or to print only one of the qualities 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Worker_ariel getWorker() {
		return this;
	}
	
// now we have the option to print the whole data on the worker at once 
	@Override
	public String toString() {
		return "Worker_ariel [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	}
	

