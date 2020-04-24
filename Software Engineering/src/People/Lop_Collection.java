package People;
import java.util.ArrayList;

public class Lop_Collection {

	private ArrayList<Person> list;

	public Lop_Collection() {
		this.list = new ArrayList<>();
	}

	public void add(Person person) {
		list.add(person);
//		System.out.print("\n" + person.getName() + " has been added to the list.");
	}

	public void remove(Person delete_person) {
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == delete_person) {
				list.remove(i);
				System.out.println(delete_person.getName() + " has been deleted from the list.");
				break;
			}
		}
	}

	public int find(Person find_person) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(find_person.getName())) {
				System.out.println(find_person.getName() + " has been found in the list at position: " + i);
				return 1;
			}
		}
		System.out.println("That person is not in the list.");
		return -1;
	}

	public void print() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).print(System.out);
		}
	}
}
