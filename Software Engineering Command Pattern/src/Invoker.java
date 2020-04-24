import javax.swing.JOptionPane;

public class Invoker {

	private Command command;
//	public JOptionPane pane;

	public Invoker() {
//		this.pane = new JOptionPane();
	}

	public void register(Command com) {
		this.command = com;
	}

	public void run() {
		String value = "";
		do {
			value = JOptionPane.showInputDialog("Please enter an integer: ");
			int number = value.charAt(0) - '0';

			if (number <= 10 && number >= 0) {
				if (number == 1 || number == 2) {
					command.execute(number);
				} else {
					System.out.println(number);
				}
			}
		} while (value.charAt(0) != 'q' && value != null);
	}
}
