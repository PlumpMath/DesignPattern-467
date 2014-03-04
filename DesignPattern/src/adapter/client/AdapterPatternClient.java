package adapter.client;

import adapter.adaper.GoldenRetrieverAdapter;
import adapter.adaptee.Dog;
import adapter.adaptee.GoldenRetriever;
import adapter.target.Cat;
import adapter.target.Garfield;

public class AdapterPatternClient {

	public void makeCatSound(Cat cat){
		cat.meow();
	}
	
	public static void main(String[] args) {
		Cat garfield = new Garfield();
		System.out.println("��������ļӷ�è����ô�У�");
		AdapterPatternClient adapterPatternClient = new AdapterPatternClient();
		adapterPatternClient.makeCatSound(garfield);
		//��������ת��һֻ����ת����è��
		Dog puppey = new GoldenRetriever();
		Cat fakeCat= new GoldenRetrieverAdapter(puppey);
		System.out.println("������ëװ���è�����ô�У�");
		adapterPatternClient.makeCatSound(fakeCat);
		
	}

}
