package factorymethod.creator;

import factorymethod.production.Fruit;
import factorymethod.production.FruitType;

/**
 * FruitFactory��һ��Creator�ĳ������������Ǵ��������ˮ��ʵ��
 * */
public interface FruitCreator {
	
	/**
	 * @param type ��������ˮ��������
	 * */
	public Fruit createFruit(FruitType type);
}
