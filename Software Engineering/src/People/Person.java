package People;

import java.io.PrintStream;

public class Person implements Cloneable {

	private String name;
	private Date birthday;

//	private Person person_clone = new Person();

//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}

	public Person(String n, Date bd) {

		this.name = new String(n);
		this.birthday = bd.clone();	
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return 2020 - this.birthday.getYear();
	}

	public void print(PrintStream pStream) {
		pStream.printf("Name: " + name + "\nDate of birth: " + birthday + "\n");
	}
}
