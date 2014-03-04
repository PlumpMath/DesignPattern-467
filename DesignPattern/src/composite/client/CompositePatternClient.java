package composite.client;

import composite.leaf.MenuItem;
import composite.root.Menu;
import composite.root.MenuComponent;

public class CompositePatternClient {
	
	
	public static void main(String[] args) {
		MenuComponent fileMenu = new Menu("File","Contains 1 menu and 1 menu item");
		MenuComponent newMenu = new Menu("New","Under file menu, contains 2 menu items");
		
		MenuComponent classMenuItem= new MenuItem("Class","Under new menu");
		MenuComponent interfaceMenuItem= new MenuItem("Interface","Under new menu");
		newMenu.add(classMenuItem);
		newMenu.add(interfaceMenuItem);
		
		MenuComponent saveMenuItem = new MenuItem("Save","Under file menu");
		
		fileMenu.add(newMenu);
		fileMenu.add(saveMenuItem);
		fileMenu.print();
	}
}
