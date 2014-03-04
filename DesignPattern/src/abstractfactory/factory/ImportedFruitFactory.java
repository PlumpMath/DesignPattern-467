package abstractfactory.factory;

import abstractfactory.production.Apple;
import abstractfactory.production.Banana;
import abstractfactory.production.ImportedApple;
import abstractfactory.production.ImportedBanana;
import abstractfactory.production.ImportedOrange;
import abstractfactory.production.Orange;


/**
 * ֻ��������ˮ����ˮ������
 * */
public class ImportedFruitFactory implements FruitFactory {

	@Override
	public Apple createApple() {
		return new ImportedApple();
	}

	@Override
	public Banana createBanana() {
		return new ImportedBanana();
	}

	@Override
	public Orange createOrange() {
		return new ImportedOrange();
	}

}
