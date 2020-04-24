package Office;
import People.Date;
import People.Lop_Collection;
import People.Person;

public class Main {

	public static void main(String[] args) {
		
		Date date = new Date(12, 6, 1995);
		Person me = new Person("Pablo", date);

//		me.print(System.out);
//		date.print(System.err);

		Date date_one = new Date(10, 3, 1980);
		Date date_two = new Date(9, 11, 1970);
		Date date_three = new Date(10, 3, 1980);
		Date date_four = new Date(2, 12, 1999);
		Date date_five = new Date(30, 5, 2000);
		Date date_six = new Date(25, 3, 1940);

		Boss person_one = new Boss("Arthur", date_one);
		Boss person_two = new Boss("Tyler", date_two);
		Worker person_three = new Worker("Andrea", date_three, person_one);
		Worker person_four = new Worker("Sofia", date_four, person_one);
		Worker person_five = new Worker("Heather", date_five, person_one);
		Worker person_six = new Worker("Henric", date_six, person_one);

//		Lop lop = new Lop();
		Lop_Collection lop_collection = new Lop_Collection();

		/* Code with normal fixed size array */

//		lop.add(person_one);
//		lop.add(person_two);
//		lop.add(person_three);
//		lop.add(person_four);
//		lop.add(person_five);
//		lop.add(person_six);

//		lop.remove(person_three);
//		
//		lop.find(person_five);

		/* Code with ArraList/Collections of bosses and workers */

		lop_collection.add(person_one);
		lop_collection.add(person_two);
		lop_collection.add(person_three);
		lop_collection.add(person_four);
		lop_collection.add(person_five);
		lop_collection.add(person_six);

//		lop_collection.remove(person_three);
//
//		lop_collection.find(person_five);
//		lop_collection.find(person_three);

//		System.out.println("There is a difference of " + date_two.diffInYears(date_four) + " years between the specified dates.");

		person_one.print(System.out);
		person_two.print(System.out);

		System.out.println();
		
		person_three.print(System.out);
		person_four.print(System.out);
		person_five.print(System.out);
		person_six.print(System.out);

		System.out.println();
		System.out.println(person_two.next());

		for (int i = 0; i < 4; i++) {
			if (person_one.next() != null) {
				System.out.println(person_one.next().getName());
			} else {
				System.out.println(person_one.next());
			}
		}
		
		System.out.println();
		person_six.new_boss(person_two);
		person_six.print(System.out);

	}
}
