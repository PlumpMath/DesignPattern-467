package templatemethod.abstracted;

/**ģ�巽���ﰴ�ղ������ÿһ�������������ڱ����ｫoperation1��operation2��Ϊ�������ṩ����Ϊ�������*/
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
