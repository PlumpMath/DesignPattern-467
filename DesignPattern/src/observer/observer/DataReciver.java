package observer.observer;

import observer.subject.Subject;

/**
 * DataReciverֻ�ѽ��յ������ݴ�ӡ����
 * */
public class DataReciver implements Observer {

	@Override
	public void update(Subject subject,Object args) {
		System.out.println("���յ����ݣ�"+Double.toString((Double)args)); //������Push��ʽ��ȡ�����ߵ�����
	}

}
