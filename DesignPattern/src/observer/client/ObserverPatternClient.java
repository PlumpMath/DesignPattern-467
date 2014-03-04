package observer.client;

import observer.observer.DataReciver;
import observer.observer.DataTransformer;
import observer.observer.Observer;
import observer.subject.DataCenter;
import observer.subject.Subject;

public class ObserverPatternClient {
	
	public static void main(String[] args) {
		//初始化数据发布者对象
		Subject dataCenter = new DataCenter();
		//初始化两个观察者对象
		Observer dataReciver = new DataReciver();
		Observer dataTransformObserver = new DataTransformer();
		//注册观察者对象到发布者对象
		dataCenter.registerObserver(dataReciver);
		dataCenter.registerObserver(dataTransformObserver);
		//改变发布者数据，通知观察者进行操作
		((DataCenter)dataCenter).setData(new Double(1));
		((DataCenter)dataCenter).setData(new Double(2));
		((DataCenter)dataCenter).setData(new Double(3));
		//从发布者对象中移除dataRecicer观察者
		System.out.println("从发布者对象中移除dataRecicer观察者");
		dataCenter.removeObserver(dataReciver);
		((DataCenter)dataCenter).setData(new Double(1));
		((DataCenter)dataCenter).setData(new Double(2));
		((DataCenter)dataCenter).setData(new Double(3));
	}
}
