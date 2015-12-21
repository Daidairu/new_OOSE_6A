package new_OOSE_6A;

import java.awt.Component;
import java.util.ArrayList;
import java.util.ListIterator;

abstract class Compoent {
	abstract void print();
}

class Composite extends Compoent {
	ArrayList<Component> list;

	public Composite() {
		list = new ArrayList<Component>();
	}

	public void addCompoent(Component c) {
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

class Leaf extends Component {
	// operation() in the "Leaf"
	void print() {
	}
}

class Question extends Compoent {
	String description;

	public Question(String desc) {
		this.description = desc;
	}

	public void print() {
		System.out.println(description);
	}
}

class main {
	
	Question q1 = new Question("q1:1+1=?");
    
	Composite addt1 = new Composite();
	addt1.addCompoent(new Question("Q2:2+2=?"));
	addt1.addCompoent(new Question("Q3:3+3=?"));

	Composite all = new Composite();
     all.addCompoent(q1);
     all.addCompoent(addt1);
     
 
	
	void m1(Component[] cc) {
		for (Component c : cc)
			c.print();
	}
}
