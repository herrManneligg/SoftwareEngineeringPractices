import People.Person;

public class Lop {

	private Person[] list;
	private int length;

	public Lop() {
		this.length = 6;
		this.list = new Person[length];
	}

	/* Length */
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void add(Person person) {
		int num = 0;
		boolean filled = false;

		while (!filled && num < length) {

			if (list[num] != null) {
				num++;
			}

			if (list[num] == null) {
				list[num] = person;
				filled = true;
			}
		}

		System.out.print("\n" + person.getName() + " has been added to the list.");
	}

	public void remove(Person delete_person) {
		for (int i = 0; i < length; i++) {
			if (list[i] == delete_person) {
				list[i] = null;
				System.out.println(delete_person.getName() + " has been deleted from the list.");
				break;
			}
		}
	}

	public void find(Person find_person) {
		for (int i = 0; i < length; i++) {
			if (list[i] == null) {
				System.err.println("There is a null value at position: " + i);
			}
			if (list[i] != null && list[i].getName().equals(find_person.getName())) {
				System.out.println(find_person.getName() + " has been found in the list at position: " + i);
			}
		}
	}

	public void print() {
		for (int i = 0; i < length; i++) {
			list[i].print(System.out);
		}
	}
}
