package templatemethod.client;

import templatemethod.abstracted.AbstractClass;
import templatemethod.concrete.ConcreteClass1;
import templatemethod.concrete.ConcreteClass2;

/**模板方法的提供基类是AbstractClass,它有两个子类ConcreteClass1和ConcreteClass2,下面分别测试两个子类的情况*/
public class TemplateMethodPatternClient {
	
	public static void main(String[] args) {
		System.out.println("============Testing concrete class 1=============");
		AbstractClass class1 = new ConcreteClass1();
		class1.templateMethod();
		System.out.println();
		System.out.println();
		System.out.println("============Testing concrete class 2=============");
		AbstractClass class2 = new ConcreteClass2();
		class2.templateMethod();
	}
}
