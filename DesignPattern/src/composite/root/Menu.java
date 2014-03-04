package composite.root;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements MenuComponent {
	
	protected String name;
	
	protected MenuComponent parent;
	
	protected String description;
	
	protected List<MenuComponent> children = new ArrayList<MenuComponent>();

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public List<MenuComponent> getChildren() {
		return children;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name= name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void add(MenuComponent child) {
		children.add(child);
		child.setParent(this);
	}

	@Override
	public void remove(MenuComponent child) {
		children.remove(child);
	}

	@Override
	public MenuComponent getChild(int i) {
		return children.get(i);
	}

	@Override
	public void print() {
		System.out.println("--------"+getName()+" contains:----------");
		Iterator<MenuComponent> it = children.iterator();
		while(it.hasNext()){
			MenuComponent child = it.next();
			child.print();
		}
		System.out.println("--------"+getName()+" contains end");
	}

	@Override
	public MenuComponent getParent() {
		return parent;
	}

	@Override
	public void setParent(MenuComponent parent) {
		
	}

}
