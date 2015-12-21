package new_OOSE_6A;

import java.util.ArrayList;
import java.util.ListIterator;

abstract class Component {
	abstract void print();
}

class Composite extends Component {
	ArrayList<Component> list;

	public Composite() {
		list = new ArrayList<Component>();
	}

	public void addComponent(Component c) {
		list.add(c);
	}

	void print() {
		ListIterator<Component> iterator = list.listIterator();
		while (iterator.hasNext()) {
			Component c = iterator.next();
			c.print();
		}
	}
}

class Question extends Component {
	String description;

	public Question(String desc) {
		this.description = desc;
	}

	public void print() {
		System.out.println(description);
	}
}


class Question2 extends Component {
	String description;

	public Question2(String desc) {
		this.description = desc;
	}

	public void print() {
		System.out.println(description);
	}
}

public class new_6a {

	public static void main(String[] args) {

		Composite test = new Composite();

		Composite addt1 = new Composite();
		addt1.addComponent(new Question("t1Q1:1+1=?"));
		addt1.addComponent(new Question("t1Q2:2+2=?"));

		Composite addt2 = new Composite();
		addt1.addComponent(new Question2("t2Q1:1*1=?"));
		addt1.addComponent(new Question2("t2Q2:2*2=?"));

		test.addComponent(addt1);
		test.addComponent(addt2);

		test.print();
		System.out.println("D0247909  HSIAO-HUNG-RU");
	}
}
