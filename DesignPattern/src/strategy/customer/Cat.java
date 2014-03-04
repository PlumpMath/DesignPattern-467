package strategy.customer;

import strategy.strategies.MakeSoundBehavior;
import strategy.strategies.PlayBehavior;

public class Cat extends Animal {

	public Cat(MakeSoundBehavior soundBehavior, PlayBehavior playBehavior) {
		super(soundBehavior, playBehavior);
	}

}
