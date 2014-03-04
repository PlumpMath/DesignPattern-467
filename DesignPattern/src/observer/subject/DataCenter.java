package observer.subject;

/**
 * DataCenterʵ��Subject�ӿڣ�����ģ��һ�����ݷַ����ģ������ݸ��µ�ʱ��
 * JDK�����ṩ��java.util.Observable��ΪSubject�����Բο����ࡣ������û��
 * �����̰߳�ȫ������
 * */
import java.util.ArrayList;
import java.util.List;

import observer.observer.Observer;

public class DataCenter implements Subject {

	private boolean changed = false;

	private List<Observer> observers;

	private double data = 0;

	public DataCenter() {
		observers = new ArrayList<Observer>();
	}

	protected void setChanged() {
		changed = true;
	}

	public boolean hasChanged() {
		return changed;
	}

	protected void clearChanged() {
		changed = false;
	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		setChanged();
		this.data = data;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int observerIndex = observers.indexOf(observer);
		if (observerIndex >= 0) {
			observers.remove(observerIndex);
		}
	}

	@Override
	public void notifyObservers() {
		if (!changed){
			return;
		}
        clearChanged();
		for (Observer observer : observers) {
			observer.update(this, data);
		}
	}

}
