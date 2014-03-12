package singleton.preconstructed;

import singleton.IPrintable;

/**
 * 饱汉式的单例，优点是不用考虑线程同步问题，缺点是不能按需创建实例，若instance的花销比较大，会对性能造成一定影响
 * */
public class PreConstructedSingleton implements IPrintable{

	private static PreConstructedSingleton instance = new PreConstructedSingleton();
	
	private PreConstructedSingleton(){
		
	}
	
	public static PreConstructedSingleton getInstance(){
		return instance;
	}

	@Override
	public void print() {
		System.out.println("A pre-constructed singleton has been created!");
	}
}
