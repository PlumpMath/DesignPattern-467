package decorator.component;


/**
 * 客机，波音公司
 * 
 * */
public class DQIceCream extends IceCream {
	
	public DQIceCream() {
		name = "DQ";
	}

	@Override
	public double cost() {
		return 20.0; // 一个没有坚果的DQ冰激凌要20元
	}

}
