package templatemethod.abstracted;

/**模板方法里按照步骤调用每一个基础操作，在本例里将operation1和operation2作为子类需提供的行为抽象出来*/
public abstract class AbstractClass {
	
	public void templateMethod(){
		primitiveOperation1();
		primitiveOperation2();
		primitiveOperation3();
		primitiveOperation4();
	}
	
	protected abstract void primitiveOperation1();
	
	protected abstract void primitiveOperation2();
	
	protected void primitiveOperation3(){
		System.out.println("This is operation 3!");
	};
	
	protected void primitiveOperation4(){
		System.out.println("This is operation 4!");
	};
}
