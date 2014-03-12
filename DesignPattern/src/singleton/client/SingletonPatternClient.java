package singleton.client;

import singleton.IPrintable;
import singleton.enumtype.EnumSingleton;
import singleton.lazy.LazySingletons;
import singleton.lazy.LazySingletons.LazySingletonTypes;
import singleton.preconstructed.PreConstructedSingleton;

public class SingletonPatternClient {

	public static void main(String[] args) {
		//����Enum�εĵ���
		EnumSingleton.INSTANCE.print();
		//���Ա���ʽ�ĵ���
		PreConstructedSingleton.getInstance().print();
		//����lazy����
		for(LazySingletonTypes type:LazySingletonTypes.values()){
			IPrintable lazySingleton = LazySingletons.getSingletonInstance(type);
			lazySingleton.print();
		}
	}

}
