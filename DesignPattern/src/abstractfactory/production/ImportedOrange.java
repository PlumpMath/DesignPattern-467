package abstractfactory.production;

/**
 * ���ڳ���
 * */
public class ImportedOrange implements Orange {

	@Override
	public void printName() {
		System.out.println("An Imported Orange created!");
	}

}
