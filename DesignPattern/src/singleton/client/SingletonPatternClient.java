package singleton.client;

import singleton.IPrintable;
import singleton.enumtype.EnumSingleton;
import singleton.lazy.LazySingletons;
import singleton.lazy.LazySingletons.LazySingletonTypes;
import singleton.preconstructed.PreConstructedSingleton;

public class SingletonPatternClient {

	public static void main(String[] args) {
		//测试Enum形的单例
		EnumSingleton.INSTANCE.print();
		//测试饱汉式的单例
		PreConstructedSingleton.getInstance().print();
		//测试lazy单例
		for(LazySingletonTypes type:LazySingletonTypes.values()){
			IPrintable lazySingleton = LazySingletons.getSingletonInstance(type);
			lazySingleton.print();
		}
	}

}
