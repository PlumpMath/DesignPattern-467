package observer.observer;

import observer.subject.Subject;

/**
 * Observer接口扮演了该设计模式中的订阅者（Observer）角色
 * @author hywang
 * */
public interface Observer {
	
	/**
	 * 当更新通知来到，update方法会调用
	 * @param subject 消息的发布者，用户可以通过调用消息的发布者里的Getter以“拉”(Pull)的方式获取数据
	 * @param args 当update方法触发时传入的数据，如果args不为空，说明发布者以“推”(Push)的方式获取数据
	 * */
	public void update(Subject subject,Object args);
	
}
