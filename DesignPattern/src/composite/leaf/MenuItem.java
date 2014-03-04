package composite.leaf;

import java.util.List;

import composite.root.MenuComponent;

public class MenuItem implements MenuComponent {

	protected String name;
	
	protected MenuComponent parent;
	
	public MenuItem(String name, String description) {
		this.name = name;
		this.description = description;
	}

	protected String description;
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDescription() {
		return name;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void add(MenuComponent child) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(MenuComponent child) {
		throw new UnsupportedOperationException();
	}

	@Override
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void print() {
		System.out.println(getName());
	}

	@Override
	public List<MenuComponent> getChildren() {
		throw new UnsupportedOperationException();
	}

	@Override
	public MenuComponent getParent() {
		return parent;
	}

	@Override
	public void setParent(MenuComponent parent) {
		this.parent = parent;
	}

}
