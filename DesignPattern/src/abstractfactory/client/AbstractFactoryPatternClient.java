package abstractfactory.client;

import abstractfactory.factory.FruitFactory;
import abstractfactory.factory.HomeMadeFruitFactory;
import abstractfactory.factory.ImportedFruitFactory;
import abstractfactory.production.Apple;
import abstractfactory.production.Banana;
import abstractfactory.production.Orange;

public class AbstractFactoryPatternClient {

	public static void main(String[] args) {
		// �Ȳ��Ա���ˮ���Ĵ���
		System.out.println("��������ˮ��");
		FruitFactory homeMadeFruitFactory = new HomeMadeFruitFactory();
		Apple homeMadeApple = homeMadeFruitFactory.createApple();
		homeMadeApple.printName();
		Banana homeMadeBanana = homeMadeFruitFactory.createBanana();
		homeMadeBanana.printName();
		Orange homeMadeOrange = homeMadeFruitFactory.createOrange();
		homeMadeOrange.printName();
		// �ٲ��Խ���ˮ���Ĵ���
		System.out.println("===============================================");
		System.out.println("��������ˮ��");
		FruitFactory importedFruitFactory = new ImportedFruitFactory();
		Apple importedMadeApple = importedFruitFactory.createApple();
		importedMadeApple.printName();
		Banana importedMadeBanana = importedFruitFactory.createBanana();
		importedMadeBanana.printName();
		Orange importedMadeOrange = importedFruitFactory.createOrange();
		importedMadeOrange.printName();
	}

}
