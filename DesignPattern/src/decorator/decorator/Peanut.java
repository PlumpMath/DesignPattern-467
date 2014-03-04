package decorator.decorator;

/**
 * ���������һ�������װ���ߣ�����ǿ������������Ļ���(cost)������(description)
 * */
import decorator.component.IceCream;

public class Peanut extends Nut {

	public Peanut(IceCream iceCream) {
		this.iceCream = iceCream;
		this.name = "peanut";
	}

	@Override
	public double cost() {
		
		return 2+iceCream.cost(); //�ӻ����ı�����Ҫ���2Ԫ
	}

	@Override
	public String getDescription() {
		return iceCream.getDescription()+"����"+name;
	}

}
