import pattern.composite.Composite;
import pattern.composite.Leaf;


public class CompositePatternDemo {

	public static void main(String[] args) {
		Leaf leaf1 = new Leaf();
		Leaf leaf2 = new Leaf();
		Leaf leaf3 = new Leaf();

		Composite composite1 = new Composite();
		composite1.add(leaf1);
		composite1.add(leaf2);

		Composite composite2 = new Composite();
		composite2.add(composite1);
		composite2.add(leaf3);

		composite2.doOperation();
	}

}
