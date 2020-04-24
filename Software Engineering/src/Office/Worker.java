package Office;
import java.io.PrintStream;

import People.Date;
import People.Person;

public class Worker extends Person {

	private Boss worker_boss;

	public Worker(String n, Date bd, Boss boss) {
		super(n, bd);
		worker_boss = boss;
		worker_boss.add_worker(this);
	}

	/* New boss setter */
	public void new_boss(Boss new_boss) {
		worker_boss.sub_worker(this);
		this.worker_boss = new_boss;
		worker_boss.add_worker(this);
	}

	/* Getter */
	private Boss getWorker_boss() {
		return worker_boss;
	}

	public void print(PrintStream ps) {
		ps.println("The worker " + getName() + " is bossed by " + getWorker_boss().getName() + ".");
	}

}
