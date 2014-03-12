package singleton.preconstructed;

import singleton.IPrintable;

/**
 * ����ʽ�ĵ������ŵ��ǲ��ÿ����߳�ͬ�����⣬ȱ���ǲ��ܰ��贴��ʵ������instance�Ļ����Ƚϴ󣬻���������һ��Ӱ��
 * */
public class PreConstructedSingleton implements IPrintable{

	private static PreConstructedSingleton instance = new PreConstructedSingleton();
	
	private PreConstructedSingleton(){
		
	}
	
	public static PreConstructedSingleton getInstance(){
		return instance;
	}

	@Override
	public void print() {
		System.out.println("A pre-constructed singleton has been created!");
	}
}
