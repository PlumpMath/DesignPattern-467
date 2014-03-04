package decorator.component;

/**
 * IceCream��һ��������,��ʾ�����裬�������Ͽ����������ּ���������װ����
 * װ���߶Է���Cost������ǿ��
 * */
public abstract class IceCream {
	
	protected String name="unknown";
	
	public abstract double cost();
	
	public String getDescription(){
		return "������"+name;
	}
	
	
}
