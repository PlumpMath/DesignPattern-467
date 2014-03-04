package decorator.decorator;

import decorator.component.IceCream;

/**
 *腰果是另一个冰激凌装饰者对象
 * */
public class Cashew extends Nut {
	
	public Cashew(IceCream iceCream) {
		this.iceCream = iceCream;
		this.name = "cashew";
	}

	@Override
	public String getDescription() {
		return iceCream.getDescription()+"加上"+name;
	}

	@Override
	public double cost() {
		return iceCream.cost()+4; //腰果贵一点，加一份需要4元
	} 

}
