package decorator.component;

/**
 * ��ϲ������
 * */
public class BaxyIceCream extends IceCream {

	public BaxyIceCream(){
		this.name = "Baxy";
	}
	@Override
	public double cost() {
		return 40; //һ����ϲ������40
	}

}
