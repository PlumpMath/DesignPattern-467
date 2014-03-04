package observer.observer;

import observer.subject.Subject;

/**
 * Observer�ӿڰ����˸����ģʽ�еĶ����ߣ�Observer����ɫ
 * @author hywang
 * */
public interface Observer {
	
	/**
	 * ������֪ͨ������update���������
	 * @param subject ��Ϣ�ķ����ߣ��û�����ͨ��������Ϣ�ķ��������Getter�ԡ�����(Pull)�ķ�ʽ��ȡ����
	 * @param args ��update��������ʱ��������ݣ����args��Ϊ�գ�˵���������ԡ��ơ�(Push)�ķ�ʽ��ȡ����
	 * */
	public void update(Subject subject,Object args);
	
}
