// OOP H.W  1 Un Ariel
package A;

import java.util.ArrayList;

public class Manager_ariel extends Worker_ariel {

	private ArrayList<Worker> workers;
	
	public Manager_ariel(String name, int id, int salary) {
		super(name, id, salary);
		this.workers = new ArrayList<Worker>();
		
		// TODO Auto-generated constructor stub	
	}

	public Manager_ariel (Manager_ariel m) {
		super(m.getWorker());
		this.workers = new ArrayList<Worker>(m.workers);
	}
	
}
