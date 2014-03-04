package decorator.decorator;

/**
 * 坚果花生是一个具体的装饰者，它增强了整个冰激凌的花费(cost)和描述(description)
 * */
import decorator.component.IceCream;

public class Peanut extends Nut {

	public Peanut(IceCream iceCream) {
		this.iceCream = iceCream;
		this.name = "peanut";
	}

	@Override
	public double cost() {
		
		return 2+iceCream.cost(); //加花生的冰激凌要多加2元
	}

	@Override
	public String getDescription() {
		return iceCream.getDescription()+"加上"+name;
	}

}
