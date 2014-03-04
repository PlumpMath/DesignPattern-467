package observer.observer;

import observer.subject.Subject;

/**
 * DataReciver只把接收到的数据打印出来
 * */
public class DataReciver implements Observer {

	@Override
	public void update(Subject subject,Object args) {
		System.out.println("接收到数据："+Double.toString((Double)args)); //这里以Push方式获取发布者的数据
	}

}
