
public class mainTest {

	public static void main(String[] args) {
		Invoker inv = new Invoker();
		MyCom mcom = new MyCom();
		
		mcom.set_name("Com");
		inv.register(mcom);
		inv.run();
	}
}
