package Office;

import java.io.PrintStream;
import java.util.ArrayList;

import People.Date;
import People.Person;

public class Boss extends Person {

	private ArrayList<Worker> worker;
	private int counter;

	/* Constructor */
	protected Boss(String n, Date bd) {
		super(n, bd);
		worker = new ArrayList<>();
		counter = 0;
	}

	/* Getter and setter */
	private ArrayList<Worker> getWorker() {
		return worker;
	}

	private void setWorker(ArrayList<Worker> worker) {
		this.worker = worker;
	}

	/* Next worker */
	protected Worker next() {
		if (worker.size() > counter) {
			Worker listworker = worker.get(counter);
			counter++;
			if (counter >= worker.size()) {
				reset();
			}
			return listworker;
		} else {
			return null;
		}
	}

	private void reset() {
		counter = 0;
	}

	/* Add workers */
	protected void add_worker(Worker new_worker) {
		worker.add(new_worker);
	}

	/* Remove workers */
	protected void sub_worker(Worker sub_worker) {
		worker.remove(sub_worker);
	}

	public void print(PrintStream ps) {
		if (worker.size() == 0) {
			ps.println("\nThe boss " + getName() + " has no workers.");
		} else {
			System.out.print("The boss " + getName() + " has the following workers: ");
			for (int i = 0; i < worker.size(); i++) {
				System.out.print(worker.get(i).getName() + " ");
			}
		}
	}
}
