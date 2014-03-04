package decorator.decorator;

import decorator.component.IceCream;

/**
 * Nut是装饰者对象的抽象类,一定要继承IceCream，否则装饰过后的对象类型和IceCream不一致
 * */
public abstract class Nut extends IceCream{
	
	protected IceCream iceCream;
	
}
