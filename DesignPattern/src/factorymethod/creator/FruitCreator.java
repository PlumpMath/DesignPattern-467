package factorymethod.creator;

import factorymethod.production.Fruit;
import factorymethod.production.FruitType;

/**
 * FruitFactory是一个Creator的抽象，它的作用是创建具体的水果实例
 * */
public interface FruitCreator {
	
	/**
	 * @param type 生产出的水果的类型
	 * */
	public Fruit createFruit(FruitType type);
}
