package decorator.component;

/**
 * IceCream是一个抽象类,表示冰激凌，冰激凌上可以有若干种坚果，坚果是装饰者
 * 装饰者对方法Cost进行增强。
 * */
public abstract class IceCream {
	
	protected String name="unknown";
	
	public abstract double cost();
	
	public String getDescription(){
		return "冰激凌"+name;
	}
	
	
}
