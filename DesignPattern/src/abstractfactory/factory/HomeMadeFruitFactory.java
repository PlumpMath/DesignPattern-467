package abstractfactory.factory;

import abstractfactory.production.Apple;
import abstractfactory.production.Banana;
import abstractfactory.production.HomeMadeApple;
import abstractfactory.production.HomeMadeBanana;
import abstractfactory.production.HomeMadeOrange;
import abstractfactory.production.Orange;

/**
 * 只创建本土水果的水果工厂
 * */
public class HomeMadeFruitFactory implements FruitFactory {

	@Override
	public Apple createApple() {
		return new HomeMadeApple();
	}

	@Override
	public Banana createBanana() {
		return new HomeMadeBanana();
	}

	@Override
	public Orange createOrange() {
		return new HomeMadeOrange();
	}

}
