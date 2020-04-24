
public class MyCom implements Command {

	private String name;
	
	public MyCom() {
		this.name = "No name assigned.";
	}
	
	public void set_name(String name) { 
		this.name = name;
	}
	
	public void execute(int number) {
		System.out.println("Command execution...");
		System.out.println("> Name: " + name + "\n> Number: " + number + "\n");
	}

	
}
