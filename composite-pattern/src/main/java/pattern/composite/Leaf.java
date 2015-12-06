package pattern.composite;

public class Leaf implements Component {

	@Override
	public void doOperation() {
		System.out.println("I'm the Leaf");
	}
}
