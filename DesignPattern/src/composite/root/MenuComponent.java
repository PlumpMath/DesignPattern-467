package composite.root;

import java.util.List;

public interface MenuComponent {

	public String getName();
	
	public void setName(String name);
	
	public String getDescription();
	
	public void setDescription(String description);
	
	public void add(MenuComponent child);
	
	public void remove(MenuComponent child);
	
	public MenuComponent getChild(int i);
	
	public List<MenuComponent> getChildren();
	
	public MenuComponent getParent();
	
	public void setParent(MenuComponent parent);
	
	public void print();
}
