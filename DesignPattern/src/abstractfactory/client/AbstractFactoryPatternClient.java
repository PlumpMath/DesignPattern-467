package abstractfactory.client;

import abstractfactory.factory.FruitFactory;
import abstractfactory.factory.HomeMadeFruitFactory;
import abstractfactory.factory.ImportedFruitFactory;
import abstractfactory.production.Apple;
import abstractfactory.production.Banana;
import abstractfactory.production.Orange;

public class AbstractFactoryPatternClient {

	public static void main(String[] args) {
		// 先测试本地水果的创建
		System.out.println("创建本地水果");
		FruitFactory homeMadeFruitFactory = new HomeMadeFruitFactory();
		Apple homeMadeApple = homeMadeFruitFactory.createApple();
		homeMadeApple.printName();
		Banana homeMadeBanana = homeMadeFruitFactory.createBanana();
		homeMadeBanana.printName();
		Orange homeMadeOrange = homeMadeFruitFactory.createOrange();
		homeMadeOrange.printName();
		// 再测试进口水果的创建
		System.out.println("===============================================");
		System.out.println("创建进口水果");
		FruitFactory importedFruitFactory = new ImportedFruitFactory();
		Apple importedMadeApple = importedFruitFactory.createApple();
		importedMadeApple.printName();
		Banana importedMadeBanana = importedFruitFactory.createBanana();
		importedMadeBanana.printName();
		Orange importedMadeOrange = importedFruitFactory.createOrange();
		importedMadeOrange.printName();
	}

}
