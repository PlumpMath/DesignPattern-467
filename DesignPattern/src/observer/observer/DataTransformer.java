package observer.observer;

import observer.subject.DataCenter;
import observer.subject.Subject;

/**
 * DataTransformer�����յ������ݽ��п������㲢��ӡ����
 * */
public class DataTransformer implements Observer {

	@Override
	public void update(Subject subject,Object args) {
		double data =((DataCenter)subject).getData(); //�������Pull��ʽ�ӷ����߶�����������
		System.out.println("�����ݣ�"+data+" ������õ���"+Double.toString(Math.sqrt(data)));
	}

}
