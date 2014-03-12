package singleton.lazy;

import singleton.IPrintable;

/**
 * @author hywang
 * */
public class LazySingletons {

	public static enum LazySingletonTypes {
		LAZY_UNSAFE, LAZY_COMMON_SAFE, LAZY_DOUBLE_CHECKED_SAFE, HOLDER_BASED
	}

	/** 1.线程不安全的饿汉式单例 */
	private static class LazyUnSafeSingleton implements IPrintable{
		private static LazyUnSafeSingleton instance = null;

		private LazyUnSafeSingleton() {

		}

		public static LazyUnSafeSingleton getInstance() {
			if (instance == null) {
				instance = new LazyUnSafeSingleton();
			}
			return instance;
		}

		@Override
		public void print() {
			System.out.println("A lazy non thread-safed singleton has been created!");
		}
	}

	/** 2.普通的线程安全的饿汉式单例 */
	private static class LazySafeSingleton implements IPrintable{
		private static LazySafeSingleton instance = null;

		private LazySafeSingleton() {

		}

		public static synchronized LazySafeSingleton getInstance() {
			if (instance == null) {
				instance = new LazySafeSingleton();
			}
			return instance;
		}

		@Override
		public void print() {
			System.out.println("A lazy common thread-safed singleton has been created!");
		}
	}

	/** 3.基于双检查的线程安全饿汉式单例，性能比2高 */
	private static class DoubleCheckLazySafeSingleton implements IPrintable{
		private static DoubleCheckLazySafeSingleton instance = null;

		private DoubleCheckLazySafeSingleton() {

		}

		public static DoubleCheckLazySafeSingleton getInstance() {
			if (instance == null) {
				synchronized (DoubleCheckLazySafeSingleton.class) {
					if (instance == null) {
						instance = new DoubleCheckLazySafeSingleton();
					}
				}
			}
			return instance;
		}

		@Override
		public void print() {
			System.out.println("A lazy double-checked thread-safed singleton has been created!");
		}
	}

	/** 4.基于内部类的线程安全饿汉式单例，不需要同步关键字 */
	private static class HolderBasedLazySafeSingleton implements IPrintable{
		private static class SingletonHolder {
			public final static HolderBasedLazySafeSingleton instance = new HolderBasedLazySafeSingleton();
		}

		public static HolderBasedLazySafeSingleton getInstance() {
			return SingletonHolder.instance;
		}

		@Override
		public void print() {
			System.out.println("A holder-based thread-safed singleton has been created!");			
		}
	}

	public static IPrintable getSingletonInstance(LazySingletonTypes type) {
		switch (type) {
		case LAZY_UNSAFE:
			return LazyUnSafeSingleton.getInstance();
		case LAZY_COMMON_SAFE:
			return LazySafeSingleton.getInstance();
		case LAZY_DOUBLE_CHECKED_SAFE:
			return DoubleCheckLazySafeSingleton.getInstance();
		case HOLDER_BASED:
			return HolderBasedLazySafeSingleton.getInstance();
		default:
			return null;
		}
	}
}
