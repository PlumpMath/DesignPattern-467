/**
 * 
 */
package abstractfactory.factory;

import abstractfactory.production.Apple;
import abstractfactory.production.Banana;
import abstractfactory.production.Orange;

/**
 * ���󹤳�ģʽ�͹�������ģʽ������Ҫ��������ǰ���ṩ������һϵ�в�Ʒ���Ʒ�Ĵ���������
 * �����߽����������Ʒ���߼��ŵ��乤��������
 * 
 * ���������Դ���������Ʒ��Ĳ�Ʒ���ֱ���ƻ��(Apple),�㽶(Banana)�ͳ���(Orange)
 * ͨ���������󹤳���ʵ�ֿ����õ��������ڱ����̵�Practice�ﶼ���������ģʽ�����
 */
public interface FruitFactory {
	
	public Apple createApple();
	
	public Banana createBanana();
	
	public Orange createOrange();
}
