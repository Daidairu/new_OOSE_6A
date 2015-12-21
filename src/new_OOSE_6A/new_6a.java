package new_OOSE_6A;

import java.awt.Component;
import java.util.ArrayList;
import java.util.ListIterator;

abstract class Compoent {
	abstract void op();
}

class Composite extends Compoent {
	ArrayList<Component> list;

	public Composite() {
		list = new ArrayList<Component>();
	}

	void addCompoent(Component c) {
		list.add(c);
	}

	
	void op() {
		ListIterator<Component> iterator = list.listIterator();
		while (iterator.hasNext()) {
			Component c = iterator.next();
			c.op();
		}

	}
}

	// "Leaf"
	class Leaf extends Component {
		// operation() in the "Leaf"
		void op() {
		}
	}

	class Question {
		String description;

		public Question(String desc) {
			this.description = desc;
		}

		public void print() {
			System.out.println(description);
		}
	}

	class main {
		void m1(Component[] cc) {
			for (Component c : cc)
				 c.op();
		}
	}

