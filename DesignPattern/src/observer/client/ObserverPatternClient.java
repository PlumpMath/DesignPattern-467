package observer.client;

import observer.observer.DataReciver;
import observer.observer.DataTransformer;
import observer.observer.Observer;
import observer.subject.DataCenter;
import observer.subject.Subject;

public class ObserverPatternClient {
	
	public static void main(String[] args) {
		//��ʼ�����ݷ����߶���
		Subject dataCenter = new DataCenter();
		//��ʼ�������۲��߶���
		Observer dataReciver = new DataReciver();
		Observer dataTransformObserver = new DataTransformer();
		//ע��۲��߶��󵽷����߶���
		dataCenter.registerObserver(dataReciver);
		dataCenter.registerObserver(dataTransformObserver);
		//�ı䷢�������ݣ�֪ͨ�۲��߽��в���
		((DataCenter)dataCenter).setData(new Double(1));
		((DataCenter)dataCenter).setData(new Double(2));
		((DataCenter)dataCenter).setData(new Double(3));
		//�ӷ����߶������Ƴ�dataRecicer�۲���
		System.out.println("�ӷ����߶������Ƴ�dataRecicer�۲���");
		dataCenter.removeObserver(dataReciver);
		((DataCenter)dataCenter).setData(new Double(1));
		((DataCenter)dataCenter).setData(new Double(2));
		((DataCenter)dataCenter).setData(new Double(3));
	}
}
