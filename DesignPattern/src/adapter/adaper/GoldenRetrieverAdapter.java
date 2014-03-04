package adapter.adaper;

import adapter.adaptee.Dog;

/**
 * ������ģʽ��װ����ģʽ��������ϵķ�ʽ����ͬ������������һ���������һ�����Ͽͻ�������Ľӿ�
 * ��������½ӿ�
 * ��װ���߲�������µĽӿڣ���ֻ�������нӿڶ����Ƕ����ض�����������ǿ
 * @author hywang
 * */
public class GoldenRetrieverAdapter implements DogAdapter {
	
	private Dog dog; //��ϱ�����Ķ�����������
	

	public GoldenRetrieverAdapter(Dog dog) {
		this.dog = dog;
	}


	@Override
	public void meow() { //���������е��ñ��������ķ���
		dog.bark();
	}

}
