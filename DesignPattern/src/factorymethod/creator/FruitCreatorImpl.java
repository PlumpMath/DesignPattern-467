package factorymethod.creator;

import factorymethod.production.Apple;
import factorymethod.production.Banana;
import factorymethod.production.Fruit;
import factorymethod.production.FruitType;
import factorymethod.production.Orange;

public class FruitCreatorImpl implements FruitCreator {

	@Override
	public Fruit createFruit(FruitType type) {
		Fruit fruit = null;
		switch (type) {
		case APPLE:
			fruit = new Apple();
			break;
		case BANANA:
			fruit = new Banana();
			break;
		case ORANGE:
			fruit = new Orange();
			break;
		default:
			fruit = new Apple();
			break;
		}
		return fruit;
	}

}
