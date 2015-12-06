package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private List<Component> childComponents = new ArrayList<Component>();
	
	@Override
	public void doOperation() {
		for (Component component : childComponents) {
			component.doOperation();
		}
	}
	
	public void add(Component component) {
		childComponents.add(component);
	}
	
	public void remove(Component component) {
		childComponents.remove(component);
	}
}
