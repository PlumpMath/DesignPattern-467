package decorator.component;


/**
 * �ͻ���������˾
 * 
 * */
public class DQIceCream extends IceCream {
	
	public DQIceCream() {
		name = "DQ";
	}

	@Override
	public double cost() {
		return 20.0; // һ��û�м����DQ������Ҫ20Ԫ
	}

}
