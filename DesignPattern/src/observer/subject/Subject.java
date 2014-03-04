package observer.subject;

import observer.observer.Observer;

/**
 * Subject�ӿڰ����˸����ģʽ�еķ����ߣ�Subject����ɫ
 * 
 * @author hywang
 * */
public interface Subject {

	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
}
