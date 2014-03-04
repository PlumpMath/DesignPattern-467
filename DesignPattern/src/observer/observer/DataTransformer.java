package observer.observer;

import observer.subject.DataCenter;
import observer.subject.Subject;

/**
 * DataTransformer将接收到的数据进行开方运算并打印出来
 * */
public class DataTransformer implements Observer {

	@Override
	public void update(Subject subject,Object args) {
		double data =((DataCenter)subject).getData(); //这里采用Pull方式从发布者对象中拉数据
		System.out.println("将数据："+data+" 开方后得到："+Double.toString(Math.sqrt(data)));
	}

}
