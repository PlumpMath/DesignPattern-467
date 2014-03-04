package observer.subject;

import observer.observer.Observer;

/**
 * Subject接口扮演了该设计模式中的发布者（Subject）角色
 * 
 * @author hywang
 * */
public interface Subject {

	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
}
