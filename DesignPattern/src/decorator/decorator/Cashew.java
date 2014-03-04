package decorator.decorator;

import decorator.component.IceCream;

/**
 *��������һ��������װ���߶���
 * */
public class Cashew extends Nut {
	
	public Cashew(IceCream iceCream) {
		this.iceCream = iceCream;
		this.name = "cashew";
	}

	@Override
	public String getDescription() {
		return iceCream.getDescription()+"����"+name;
	}

	@Override
	public double cost() {
		return iceCream.cost()+4; //������һ�㣬��һ����Ҫ4Ԫ
	} 

}
