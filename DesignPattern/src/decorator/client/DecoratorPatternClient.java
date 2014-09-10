package decorator.client;

import decorator.component.BaxyIceCream;
import decorator.component.DQIceCream;
import decorator.component.IceCream;
import decorator.decorator.Cashew;
import decorator.decorator.Peanut;

/**
 * 装饰者模式在Java的Stream中应用广泛
 * */
public class DecoratorPatternClient {
	
	public static void main(String[] args) {
		System.out.println("单独点一份DQ冰激凌：");
		IceCream dqIceCream= new DQIceCream();
		System.out.println(dqIceCream.getDescription()+": "+dqIceCream.cost());
		System.out.println("附加一份花生的DQ冰激凌：");
		dqIceCream = new Peanut(dqIceCream);
		System.out.println(dqIceCream.getDescription());
		System.out.println(dqIceCream.cost());
		System.out.println("再附加一份腰果的DQ冰激凌：");
		dqIceCream = new Cashew(dqIceCream);
		System.out.println(dqIceCream.getDescription());
		System.out.println(dqIceCream.cost());
		System.out.println("=======================================");
		System.out.println("新点一杯八喜冰激凌");
		IceCream baxyIceCream = new BaxyIceCream(); 
		System.out.println(baxyIceCream.getDescription()+": "+baxyIceCream.cost());
		System.out.println("附加一份花生的八喜冰激凌：");
		baxyIceCream = new Peanut(baxyIceCream);
		System.out.println(baxyIceCream.getDescription());
		System.out.println(baxyIceCream.cost());
		System.out.println("再附加一份腰果的八喜冰激凌：");
		baxyIceCream = new Cashew(baxyIceCream);
		System.out.println(baxyIceCream.getDescription());
		System.out.println(baxyIceCream.cost());
		System.out.println("一共附加两份腰果的八喜冰激凌：");
		baxyIceCream = new Cashew(baxyIceCream);
		System.out.println(baxyIceCream.getDescription());
		System.out.println(baxyIceCream.cost());
	}
}
