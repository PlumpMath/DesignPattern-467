package strategy.customer;

import strategy.strategies.MakeSoundBehavior;
import strategy.strategies.PlayBehavior;

/**
 * 动物有两种行为，一种是叫（MakeSound），另外一种是玩耍(Play) 将两种行为分别抽象成两个接口，动物类通过组合使用这两种接口
 * 
 * @author hywang
 */
public class Animal {
	MakeSoundBehavior soundBehavior;
	PlayBehavior playBehavior;

	/**
	 * 将两种行为策略通过构造方法传入
	 * */
	public Animal(MakeSoundBehavior soundBehavior, PlayBehavior playBehavior) {
		super();
		this.soundBehavior = soundBehavior;
		this.playBehavior = playBehavior;
	}
	
	/**
	 * 通过setter动态修改行为策略
	 * */
	public void setSoundBehavior(MakeSoundBehavior soundBehavior) {
		this.soundBehavior = soundBehavior;
	}

	public void setPlayBehavior(PlayBehavior playBehavior) {
		this.playBehavior = playBehavior;
	}

	/*装入的玩耍策略的具体调用*/
	public void performPlay() {
		playBehavior.act();
	};
	/*装入的发声策略的具体调用*/
	public void performMakeSound() {
		soundBehavior.makeSound();
	}
	
	/*其它的酱油方法，在本例中不是重点*/
	public void otherMethod(){
		
	}
}
