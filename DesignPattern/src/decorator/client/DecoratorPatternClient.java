package decorator.client;

import decorator.component.BaxyIceCream;
import decorator.component.DQIceCream;
import decorator.component.IceCream;
import decorator.decorator.Cashew;
import decorator.decorator.Peanut;

/**
 * װ����ģʽ��Java��Stream��Ӧ�ù㷺
 * */
public class DecoratorPatternClient {
	
	public static void main(String[] args) {
		System.out.println("������һ��DQ�����裺");
		IceCream dqIceCream= new DQIceCream();
		System.out.println(dqIceCream.getDescription()+": "+dqIceCream.cost());
		System.out.println("����һ�ݻ�����DQ�����裺");
		dqIceCream = new Peanut(dqIceCream);
		System.out.println(dqIceCream.getDescription());
		System.out.println(dqIceCream.cost());
		System.out.println("�ٸ���һ��������DQ�����裺");
		dqIceCream = new Cashew(dqIceCream);
		System.out.println(dqIceCream.getDescription());
		System.out.println(dqIceCream.cost());
		System.out.println("=======================================");
		System.out.println("�µ�һ����ϲ������");
		IceCream baxyIceCream = new BaxyIceCream(); 
		System.out.println(baxyIceCream.getDescription()+": "+baxyIceCream.cost());
		System.out.println("����һ�ݻ����İ�ϲ�����裺");
		baxyIceCream = new Peanut(baxyIceCream);
		System.out.println(baxyIceCream.getDescription());
		System.out.println(baxyIceCream.cost());
		System.out.println("�ٸ���һ�������İ�ϲ�����裺");
		baxyIceCream = new Cashew(baxyIceCream);
		System.out.println(baxyIceCream.getDescription());
		System.out.println(baxyIceCream.cost());
		System.out.println("һ���������������İ�ϲ�����裺");
		baxyIceCream = new Cashew(baxyIceCream);
		System.out.println(baxyIceCream.getDescription());
		System.out.println(baxyIceCream.cost());
	}
}
