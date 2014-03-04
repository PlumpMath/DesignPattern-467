package decorator.component;

/**
 * °ËÏ²±ù¼¤Áè
 * */
public class BaxyIceCream extends IceCream {

	public BaxyIceCream(){
		this.name = "Baxy";
	}
	@Override
	public double cost() {
		return 40; //Ò»±­°ËÏ²±ù¼¤Áè40
	}

}
