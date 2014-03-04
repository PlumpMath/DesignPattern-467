package adapter.adaper;

import adapter.adaptee.Dog;

/**
 * ﾊﾊﾅ菷｣ﾊｽｺﾍﾗｰﾊﾎﾕﾟﾄ｣ﾊｽｶｼｲﾉﾓﾃﾗ鮗ﾏｵﾄｷｽﾊｽ｣ｬｲｻﾍｬｵ耿ﾚﾓﾚﾊﾊﾅ菷ｻｶｨｻ盍揵嵭ｻｸ釚ﾏｿﾍｻｧｶﾋﾐ霽ﾄｽﾓｿﾚ
 * ｼｴｻ盍揵昻ﾂｽﾓｿﾚ
 * ｶｰﾊﾎﾕﾟｲｻｻ盍揵昻ﾂｵﾄｽﾓｿﾚ｣ｬﾋ�ﾖｻﾊﾇﾔﾚﾏﾖﾓﾐｽﾓｿﾚｶﾔﾏﾇｶﾔﾆ萠ﾘｶｨｷｽｷｨｽﾐﾔｿ
 * @author hywang
 * */
public class GoldenRetrieverAdapter implements DogAdapter {
	
	private Dog dog; //ﾗ鮗ﾏｱｻﾊﾊﾅ莊ﾄｶﾔﾏｽﾊﾊﾅ菷ﾐ
	

	public GoldenRetrieverAdapter(Dog dog) {
		this.dog = dog;
	}


	@Override
	public void meow() { //ﾔﾚﾊﾊﾅ菷ﾐｵﾃｱｻﾊﾊﾅ荼ﾔﾏﾄｷｽｷｨ
		dog.bark();
	}

}
