package factorymethod.client;

import factorymethod.creator.FruitCreator;
import factorymethod.creator.FruitCreatorImpl;
import factorymethod.production.Fruit;
import factorymethod.production.FruitType;

public class FactoryMethodPatternClient {

	public static void main(String[] args) {
		FruitCreator fruitFactory = new FruitCreatorImpl();
		
		Fruit apple = fruitFactory.createFruit(FruitType.APPLE);
		apple.printName();
		
		Fruit banana = fruitFactory.createFruit(FruitType.BANANA);
		banana.printName();
		
		Fruit orange = fruitFactory.createFruit(FruitType.ORANGE);
		orange.printName();
	}

}
