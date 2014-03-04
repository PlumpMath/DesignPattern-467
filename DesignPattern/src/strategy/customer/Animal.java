package strategy.customer;

import strategy.strategies.MakeSoundBehavior;
import strategy.strategies.PlayBehavior;

/**
 * ������������Ϊ��һ���ǽУ�MakeSound��������һ������ˣ(Play) ��������Ϊ�ֱ����������ӿڣ�������ͨ�����ʹ�������ֽӿ�
 * 
 * @author hywang
 */
public class Animal {
	MakeSoundBehavior soundBehavior;
	PlayBehavior playBehavior;

	/**
	 * ��������Ϊ����ͨ�����췽������
	 * */
	public Animal(MakeSoundBehavior soundBehavior, PlayBehavior playBehavior) {
		super();
		this.soundBehavior = soundBehavior;
		this.playBehavior = playBehavior;
	}
	
	/**
	 * ͨ��setter��̬�޸���Ϊ����
	 * */
	public void setSoundBehavior(MakeSoundBehavior soundBehavior) {
		this.soundBehavior = soundBehavior;
	}

	public void setPlayBehavior(PlayBehavior playBehavior) {
		this.playBehavior = playBehavior;
	}

	/*װ�����ˣ���Եľ������*/
	public void performPlay() {
		playBehavior.act();
	};
	/*װ��ķ������Եľ������*/
	public void performMakeSound() {
		soundBehavior.makeSound();
	}
	
	/*�����Ľ��ͷ������ڱ����в����ص�*/
	public void otherMethod(){
		
	}
}
