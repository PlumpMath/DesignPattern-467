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
		System.out.println("听听纯粹的加菲猫会怎么叫：");
		AdapterPatternClient adapterPatternClient = new AdapterPatternClient();
		adapterPatternClient.makeCatSound(garfield);
		//用适配器转换一只狗狗转换成猫咪
		Dog puppey = new GoldenRetriever();
		Cat fakeCat= new GoldenRetrieverAdapter(puppey);
		System.out.println("听听金毛装扮的猫咪会怎么叫：");
		adapterPatternClient.makeCatSound(fakeCat);
		
	}

}
